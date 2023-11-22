package com.goodnews.map.util;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ExceptionResponseDto {
    private int code;
    private String message;

    @Builder
    public ExceptionResponseDto(int code, String message) {
        this.code = code;
        this.message = message;
    }
}


