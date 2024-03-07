package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdminstrationDto;
import com.company.school.dto.response.ResponseAdministrationDto;
import org.springframework.stereotype.Service;

@Service
public interface AdminstrationService {
    ResponseDto<ResponseAdministrationDto> createEntity(RequestAdminstrationDto dto);

    ResponseDto<ResponseAdministrationDto> getEntity(Integer entityId);

    ResponseDto<ResponseAdministrationDto> updateEntity(Integer entityId, RequestAdminstrationDto dto);

    ResponseDto<ResponseAdministrationDto> deleteEntity(Integer entityId);
}
