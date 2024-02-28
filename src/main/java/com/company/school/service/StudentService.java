package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    ResponseDto<ResponseStudentDto> createEntity(RequestStudentDto dto);

    ResponseDto<ResponseStudentDto> getEntity(Integer entityId);

    ResponseDto<ResponseStudentDto> updateEntity(Integer entityId, RequestStudentDto dto);

    ResponseDto<ResponseStudentDto> deleteEntity(Integer entityId);
}
