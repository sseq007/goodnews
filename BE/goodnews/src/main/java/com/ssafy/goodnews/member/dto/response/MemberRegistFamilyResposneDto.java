package com.ssafy.goodnews.member.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberRegistFamilyResposneDto {

    private String familyId;

    @Builder
    public MemberRegistFamilyResposneDto(String familyId) {
        this.familyId = familyId;
    }
}
