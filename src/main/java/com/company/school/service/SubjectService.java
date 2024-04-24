package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import org.springframework.stereotype.Service;

@Service
public interface SubjectService {

    ResponseDto<ResponseSubjectDto> createSubject(RequestSubjectDto dto);

    ResponseDto<ResponseSubjectDto> getSubject(Integer subjectId);

    ResponseDto<ResponseSubjectDto> updateSubject(Integer subjectId, RequestSubjectDto dto);

    ResponseDto<ResponseSubjectDto> deleteSubject(Integer subjectId);



}
