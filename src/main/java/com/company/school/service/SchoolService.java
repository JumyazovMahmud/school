package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import org.springframework.stereotype.Service;

@Service
public interface SchoolService {

    ResponseDto<ResponseSchoolDto> createEntity(RequestSchoolDto dto);

    ResponseDto<ResponseSchoolDto> getEntity(Integer entityId);

    ResponseDto<ResponseSchoolDto> updateEntity(Integer entityId, RequestSchoolDto dto);

    ResponseDto<ResponseSchoolDto> deleteEntity(Integer entityId);
}
