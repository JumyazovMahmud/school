package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import com.company.school.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {
    @Override
    public ResponseDto<ResponseAttendanceDto> createEntity(RequestAttendanceDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAttendanceDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAttendanceDto> updateEntity(Integer entityId, RequestAttendanceDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAttendanceDto> deleteEntity(Integer entityId) {
        return null;
    }
}
