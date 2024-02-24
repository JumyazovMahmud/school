package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdminstrationDto;
import com.company.school.dto.response.ResponseAdminstrationDto;
import com.company.school.service.AdminstrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminstrationServiceImpl implements AdminstrationService {
    @Override
    public ResponseDto<ResponseAdminstrationDto> createEntity(RequestAdminstrationDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdminstrationDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdminstrationDto> updateEntity(Integer entityId, RequestAdminstrationDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdminstrationDto> deleteEntity(Integer entityId) {
        return null;
    }
}
