package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdminstrationDto;
import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAdminstrationDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import org.springframework.stereotype.Service;

@Service
public interface AdminstrationService {
    ResponseDto<ResponseAdminstrationDto> createEntity(RequestAdminstrationDto dto);

    ResponseDto<ResponseAdminstrationDto> getEntity(Integer entityId);

    ResponseDto<ResponseAdminstrationDto> updateEntity(Integer entityId, RequestAdminstrationDto dto);

    ResponseDto<ResponseAdminstrationDto> deleteEntity(Integer entityId);
}
