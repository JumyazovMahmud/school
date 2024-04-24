package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdministrationDto;
import com.company.school.dto.response.ResponseAdministrationDto;
import org.springframework.stereotype.Service;

@Service
public interface AdministrationService {

    ResponseDto<ResponseAdministrationDto> createAdministration(RequestAdministrationDto dto);

    ResponseDto<ResponseAdministrationDto> getAdministration(Integer parentId);

    ResponseDto<ResponseAdministrationDto> updateAdministration(Integer parentId, RequestAdministrationDto dto);

    ResponseDto<ResponseAdministrationDto> deleteAdministration(Integer parentId);

}
