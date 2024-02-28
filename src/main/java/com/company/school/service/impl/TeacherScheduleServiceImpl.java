package com.company.school.service.impl;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseTeacherScheduleDto;
import com.company.school.service.TeacherScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TeacherScheduleServiceImpl implements TeacherScheduleService {

    @Override
    public ResponseDto<ResponseTeacherScheduleDto> create(RequestTeacherScheduleDto request) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherScheduleDto> get(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherScheduleDto> update(Integer entityId, RequestTeacherScheduleDto request) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherScheduleDto> delete(Integer entityId) {
        return null;
    }
}
