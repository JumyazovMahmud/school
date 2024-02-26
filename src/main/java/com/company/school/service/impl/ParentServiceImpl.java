package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import com.company.school.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ParentServiceImpl implements ParentService {

    @Override
    public ResponseDto<ResponseParentDto> createEntity(RequestParentDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseParentDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseParentDto> updateEntity(Integer entityId, RequestParentDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseParentDto> deleteEntity(Integer entityId) {
        return null;
    }
}
