package com.company.school.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDto<T> {
    private int code;

    private String message;

    private boolean success;

    private T content;
}
