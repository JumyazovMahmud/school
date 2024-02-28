package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentScheduleDto;
import com.company.school.dto.response.ResponseStudentScheduleDto;
import com.company.school.service.StudentScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentScheduleServiceImpl implements StudentScheduleService {

    @Override
    public ResponseDto<ResponseStudentScheduleDto> create(RequestStudentScheduleDto request) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentScheduleDto> get(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentScheduleDto> update(Integer entityId, RequestStudentScheduleDto request) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentScheduleDto> delete(Integer entityId) {
        return null;
    }
}
