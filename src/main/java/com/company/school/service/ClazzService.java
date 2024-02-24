package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestClassDto;
import com.company.school.dto.response.ResponseClassDto;
import org.springframework.stereotype.Service;

@Service
public interface ClazzService {

    ResponseDto<ResponseClassDto> createEntity(RequestClassDto dto);

    ResponseDto<ResponseClassDto> getEntity(Integer entityId);

    ResponseDto<ResponseClassDto> updateEntity(Integer entityId, RequestClassDto dto);

    ResponseDto<ResponseClassDto> deleteEntity(Integer entityId);
}
