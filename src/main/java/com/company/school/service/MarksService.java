package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestMarksDto;
import com.company.school.dto.response.ResponseMarksDto;
import org.springframework.stereotype.Service;

@Service
public interface MarksService {
    ResponseDto<ResponseMarksDto> createEntity(RequestMarksDto dto);

    ResponseDto<ResponseMarksDto> getEntity(Integer entityId);

    ResponseDto<ResponseMarksDto> updateEntity(Integer entityId, RequestMarksDto dto);

    ResponseDto<ResponseMarksDto> deleteEntity(Integer entityId);
}
