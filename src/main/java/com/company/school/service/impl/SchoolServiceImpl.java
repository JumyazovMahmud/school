package com.company.school.service.impl;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.service.SchoolService;
import org.springframework.stereotype.Component;

@Component
public class SchoolServiceImpl implements SchoolService {

    @Override
    public ResponseDto<ResponseSchoolDto> createSchool(RequestSchoolDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSchoolDto> getSchool(Integer schoolId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSchoolDto> updateSchool(Integer schoolId, RequestSchoolDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseSchoolDto> deleteSchool(Integer schoolId) {
        return null;
    }
}
