package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import com.company.school.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    @Override
    public ResponseDto<ResponseSubjectDto> createEntity(RequestSubjectDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSubjectDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSubjectDto> updateEntity(Integer entityId, RequestSubjectDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSubjectDto> deleteEntity(Integer entityId) {
        return null;
    }
}
