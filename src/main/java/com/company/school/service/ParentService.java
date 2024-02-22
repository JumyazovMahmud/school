package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import org.springframework.stereotype.Service;

@Service
public interface ParentService {

    ResponseDto<ResponseParentDto> createEntity(RequestParentDto dto);

    ResponseDto<ResponseParentDto> getEntity(Integer entityId);

    ResponseDto<ResponseParentDto> updateEntity(Integer entityId, RequestParentDto dto);

    ResponseDto<ResponseParentDto> deleteEntity(Integer entityId);

}
