package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdministrationDto;
import com.company.school.dto.response.ResponseAdministrationDto;
import com.company.school.service.AdministrationService;
import org.springframework.stereotype.Component;

@Component
public class AdministrationServiceImpl implements AdministrationService {

    @Override
    public ResponseDto<ResponseAdministrationDto> createAdministration(RequestAdministrationDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdministrationDto> getAdministration(Integer parentId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdministrationDto> updateAdministration(Integer parentId, RequestAdministrationDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAdministrationDto> deleteAdministration(Integer parentId) {
        return null;
    }
}
