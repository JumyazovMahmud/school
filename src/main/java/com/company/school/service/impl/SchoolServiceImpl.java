package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    @Override
    public ResponseDto<ResponseSchoolDto> createEntity(RequestSchoolDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSchoolDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSchoolDto> updateEntity(Integer entityId, RequestSchoolDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSchoolDto> deleteEntity(Integer entityId) {
        return null;
    }
}
