package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdminstrationDto;
import com.company.school.dto.response.ResponseAdministrationDto;
import com.company.school.service.AdminstrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminstrationServiceImpl implements AdminstrationService {
    @Override
    public ResponseDto<ResponseAdministrationDto> createEntity(RequestAdminstrationDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdministrationDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdministrationDto> updateEntity(Integer entityId, RequestAdminstrationDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdministrationDto> deleteEntity(Integer entityId) {
        return null;
    }
}
