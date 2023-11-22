package com.ssafy.goodnews.member.service;

import com.ssafy.goodnews.common.domain.BaseEntity;
import com.ssafy.goodnews.common.dto.BaseResponseDto;
import com.ssafy.goodnews.common.dto.LoginDto;
import com.ssafy.goodnews.common.dto.TokenDto;
import com.ssafy.goodnews.common.exception.CustomException;
import com.ssafy.goodnews.common.exception.validator.FamilyValidator;
import com.ssafy.goodnews.common.exception.validator.MemberValidator;
import com.ssafy.goodnews.common.exception.validator.TokenValidator;
import com.ssafy.goodnews.jwt.JwtTokenProvider;
import com.ssafy.goodnews.member.domain.Family;
import com.ssafy.goodnews.member.domain.FamilyMember;
import com.ssafy.goodnews.member.domain.Member;
import com.ssafy.goodnews.member.dto.request.member.*;
import com.ssafy.goodnews.member.dto.response.member.MemberFirstLoginResponseDto;
import com.ssafy.goodnews.member.dto.response.member.MemberInfoResponseDto;
import com.ssafy.goodnews.member.repository.MemberRepository;
import com.ssafy.goodnews.member.repository.querydsl.MemberQueryDslRepository;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberQueryDslRepository memberQueryDslRepository;
    private final TokenValidator tokenValidator;
    private final MemberValidator memberValidator;
    private final JwtTokenProvider jwtTokenProvider;
    @Value("${jwt.secretKey}")
    private String secretKey;
    private final RedisTemplate<String, String> redisTemplate;
    private FamilyValidator familyValidator;

    @Transactional
    public BaseResponseDto registMemberInfo(MemberRegistRequestDto memberRegistRequestDto) {



        Member newMember = Member.builder()
                .id(memberRegistRequestDto.getMemberId())
                .phoneNumber(memberRegistRequestDto.getPhoneNumber())
                .name(memberRegistRequestDto.getName())
                .birthDate(memberRegistRequestDto.getBirthDate())
                .gender(memberRegistRequestDto.getGender())
                .bloodType(memberRegistRequestDto.getBloodType())
                .addInfo(memberRegistRequestDto.getAddInfo())
                .build();

        Optional<Member> findMember = memberRepository.findById(memberRegistRequestDto.getMemberId());
        if (findMember.isPresent()) {
            findMember.get().updateAllMemberInfo(newMember);
        } else {

            memberRepository.save(newMember);
        }




        return BaseResponseDto.builder()
                .success(true)
                .message("추가 정보 등록 성공했습니다")
                .data(newMember)
                .build();
    }

    @Transactional(readOnly = true)
    public BaseResponseDto firstLoginSearch(MemberFirstLoginRequestDto memberFirstLoginRequestDto) {

        Optional<Member> findMember = memberRepository.findById(memberFirstLoginRequestDto.getMemberId());


        if (findMember.isPresent()) {
            return BaseResponseDto.builder()
                    .success(true)
                    .message("최초 로그인 사용 여부 조회 성공했습니다")
                    .data(MemberFirstLoginResponseDto.builder()
                            .firstLogin(true)
                            .build())
                    .build();
        } else {
            return BaseResponseDto.builder()
                    .success(true)
                    .message("최초 로그인 사용 여부 조회 성공했습니다")
                    .data(MemberFirstLoginResponseDto.builder()
                            .firstLogin(false)
                            .build())
                    .build();
        }

    }

    @Transactional
    public BaseResponseDto updateMemberInfo(String memberId, MemberInfoUpdateRequestDto memberInfoUpdateRequestDto) {

        Optional<Member> findMember = memberRepository.findById(memberId);

        memberValidator.checkMember(findMember, memberId);

        findMember.get().updateMemberInfo(memberInfoUpdateRequestDto);

        return BaseResponseDto.builder()
                .success(true)
                .message("회원 정보 수정 성공했습니다")
                .build();
    }

    @Transactional(readOnly = true)
    public BaseResponseDto getMemberInfo(String memberId) {
        Optional<Member> findMember = memberRepository.findById(memberId);
        memberValidator.checkMember(findMember, memberId);
        Optional<FamilyMember> findFamily = memberQueryDslRepository.findFamilyId(memberId);
        if (findFamily.isEmpty()) {
            return BaseResponseDto.builder()
                    .success(true)
                    .message("회원 정보 조회를 성공했습니다")
                    .data(MemberInfoResponseDto.builder()
                            .member(findMember.get())
                            .familyId(null)
                            .build()
                    ).build();
        }
        return BaseResponseDto.builder()
                .success(true)
                .message("회원 정보 조회를 성공했습니다")
                .data(MemberInfoResponseDto.builder()
                        .member(findMember.get())
                        .familyId(findFamily.get().getFamily().getFamilyId())
                        .build()
                ).build();
    }

    @Transactional
    public LoginDto loginAdmin(MemberLoginAdminRequestDto memberLoginAdminRequestDto) {

        Optional<Member> findAdmin = memberRepository.findByIdAndPassword(memberLoginAdminRequestDto.getId(), memberLoginAdminRequestDto.getPassword());
        memberValidator.checkAdmin(findAdmin, memberLoginAdminRequestDto.getId());


        return LoginDto.builder()
                .memberId(findAdmin.get().getId())
                .build();
    }

    @Transactional
    public TokenDto reissue(String refreshToken) {
        log.info("재발급서비스 진입!!!");

        if (!jwtTokenProvider.validateToken(refreshToken)) {
            throw new CustomException(HttpStatus.BAD_REQUEST, 403, "토큰에 문제 생겼어요");
        }

        String id = Jwts.parser().setSigningKey(secretKey.getBytes())
                .parseClaimsJws(refreshToken).getBody().getId();


        Optional<Member> findMember = memberRepository.findById(id);
        memberValidator.checkMember(findMember, id);

        String redisRefreshToken = redisTemplate.opsForValue().get(findMember.get().getId());
        tokenValidator.checkRedisRefreshToken(refreshToken, redisRefreshToken);

        String newAccessToken = jwtTokenProvider.createAccessToken(findMember.get().getId());
        String newRefreshToken = jwtTokenProvider.createRefreshToken(findMember.get().getId());

        jwtTokenProvider.storeRefreshToken(findMember.get().getId(), newRefreshToken);
        return TokenDto.builder()
                .accessToken(newAccessToken)
                .refreshToken(newRefreshToken)
                .memberId(findMember.get().getId())
                .build();
    }

    @Transactional(readOnly = true)
    public Member findMemberByJwtToken(String token) {
        String id = String.valueOf(Jwts.parser().setSigningKey(secretKey.getBytes())
                .parseClaimsJws(token).getBody().get("sub"));
        Optional<Member> findMember = memberRepository.findById(id);
        memberValidator.checkMember(findMember, id);

        return findMember.get();
    }

    @Transactional
    public BaseResponseDto updateMemberState(String memberId, String state) {

        Optional<Member> findMember = memberRepository.findById(memberId);
        memberValidator.checkMember(findMember,memberId);
        findMember.get().updateMemberState(state);
        return BaseResponseDto.builder()
                .success(true)
                .message("회원 상태 정보 수정을 성공했습니다")
                .build();
    }

    @Transactional
    public BaseResponseDto updateMember(String memberId, MemberUpdateDto memberUpdateDto) {
        Optional<Member> findMember = memberRepository.findById(memberId);
        memberValidator.checkMember(findMember, memberId);
        findMember.get().updateMember(findMember.get());
        return BaseResponseDto.builder()
                .success(true)
                .message("멤버 위치 및 마지막 연결 시각을 업데이트했습니다")
                .build();
    }
}
