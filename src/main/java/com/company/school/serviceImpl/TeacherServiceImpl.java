package com.company.school.serviceImpl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    @Override
    public ResponseDto<ResponseTeacherDto> create(RequestTeacherDto request) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherDto> get(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherDto> update(Integer entityId, RequestTeacherDto request) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherDto> delete(Integer entityId) {
        return null;
    }
}
