package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    ResponseDto<ResponseTeacherDto> create(RequestTeacherDto request);

    ResponseDto<ResponseTeacherDto> get(Integer entityId);

    ResponseDto<ResponseTeacherDto> update(Integer entityId , RequestTeacherDto request);

    ResponseDto<ResponseTeacherDto> delete(Integer entityId);
}
