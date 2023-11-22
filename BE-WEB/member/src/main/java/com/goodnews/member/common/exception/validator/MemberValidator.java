package com.goodnews.member.common.exception.validator;

import com.goodnews.member.common.exception.CustomException;
import com.goodnews.member.common.exception.message.MemberErrorEnum;
import com.goodnews.member.member.domain.Member;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Component
public class MemberValidator {

    public void checkMember(Optional<Member> member, String memberId) {
        if (member.isEmpty()) {
            throw CustomException.builder()
                    .status(HttpStatus.BAD_REQUEST)
                    .code(MemberErrorEnum.INVALID_MEMBER.getCode())
                    .message(MemberErrorEnum.INVALID_MEMBER.getMessage() + memberId)
                    .build();
        }
    }

    public void checkAdmin(Optional<Member> member, String memberId) {
        if (member.isEmpty() || member.get().getRole().equals("ADMIN")) {
            throw CustomException.builder()
                    .status(HttpStatus.BAD_REQUEST)
                    .code(MemberErrorEnum.INVALID_ADMIN.getCode())
                    .message(MemberErrorEnum.INVALID_ADMIN.getMessage() + memberId)
                    .build();
        }
    }


    public void checkPhoneMember(Optional<Member> findMember, String phoneNumber) {

        if (findMember.isEmpty()) {
            throw CustomException.builder()
                    .status(HttpStatus.BAD_REQUEST)
                    .code(MemberErrorEnum.INVALID_PHONE.getCode())
                    .message(MemberErrorEnum.INVALID_PHONE.getMessage() + phoneNumber)
                    .build();
        }
    }
}
