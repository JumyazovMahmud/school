package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Override
    public ResponseDto<ResponseStudentDto> createEntity(RequestStudentDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentDto> updateEntity(Integer entityId, RequestStudentDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentDto> deleteEntity(Integer entityId) {
        return null;
    }
}
