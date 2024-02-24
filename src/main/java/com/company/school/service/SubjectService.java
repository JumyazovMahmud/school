package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import org.springframework.stereotype.Service;

@Service
public interface SubjectService {
    ResponseDto<ResponseSubjectDto> createEntity(RequestSubjectDto dto);

    ResponseDto<ResponseSubjectDto> getEntity(Integer entityId);

    ResponseDto<ResponseSubjectDto> updateEntity(Integer entityId, RequestSubjectDto dto);

    ResponseDto<ResponseSubjectDto> deleteEntity(Integer entityId);
}
