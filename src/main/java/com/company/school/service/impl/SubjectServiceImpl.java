package com.company.school.service.impl;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import com.company.school.service.SubjectService;
import org.springframework.stereotype.Component;

@Component
public class SubjectServiceImpl implements SubjectService {


    @Override
    public ResponseDto<ResponseSubjectDto> createSubject(RequestSubjectDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSubjectDto> getSubject(Integer subjectId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSubjectDto> updateSubject(Integer subjectId, RequestSubjectDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSubjectDto> deleteSubject(Integer subjectId) {
        return null;
    }
}
