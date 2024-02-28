package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestClassDto;
import com.company.school.dto.response.ResponseClassDto;
import com.company.school.service.ClazzService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClazzServiceImpl implements ClazzService {

    @Override
    public ResponseDto<ResponseClassDto> createEntity(RequestClassDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseClassDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseClassDto> updateEntity(Integer entityId, RequestClassDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseClassDto> deleteEntity(Integer entityId) {
        return null;
    }
}
