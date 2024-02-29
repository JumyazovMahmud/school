package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestMarksDto;
import com.company.school.dto.response.ResponseMarksDto;
import com.company.school.service.MarksService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.DeclareWarning;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MarksServiceImpl implements MarksService {
    @Override
    public ResponseDto<ResponseMarksDto> createEntity(RequestMarksDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseMarksDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseMarksDto> updateEntity(Integer entityId, RequestMarksDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseMarksDto> deleteEntity(Integer entityId) {
        return null;
    }
}
