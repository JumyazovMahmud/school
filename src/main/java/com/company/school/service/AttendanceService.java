package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import org.springframework.stereotype.Service;

@Service
public interface AttendanceService {
    ResponseDto<ResponseAttendanceDto> createEntity(RequestAttendanceDto dto);

    ResponseDto<ResponseAttendanceDto> getEntity(Integer entityId);

    ResponseDto<ResponseAttendanceDto> updateEntity(Integer entityId, RequestAttendanceDto dto);

    ResponseDto<ResponseAttendanceDto> deleteEntity(Integer entityId);
}
