package com.jojldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 모든 final 필드가 포함된 생성자 생성
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String    name;
    private final int       amount;
}
