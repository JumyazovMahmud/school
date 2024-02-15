package com.company.school.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    public String success;
    /*
     *  1 already exists
     *  0 it is ok         -> 202
     * -1 is not found     -> 404
     * -2 db error         -> 400
     * -3 validation error -> 400
     * -4 any exception    -> 400
     * -5 unauthorised     -> 401
     * */
    private int code;


    private T content;

    private List<ErrorDto> errorList;


}
