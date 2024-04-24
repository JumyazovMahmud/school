package com.company.school.service;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import org.springframework.stereotype.Service;

@Service
public interface SchoolService {

    ResponseDto<ResponseSchoolDto> createSchool(RequestSchoolDto dto);

    ResponseDto<ResponseSchoolDto> getSchool(Integer schoolId);

    ResponseDto<ResponseSchoolDto> updateSchool(Integer schoolId, RequestSchoolDto dto);

    ResponseDto<ResponseSchoolDto> deleteSchool(Integer schoolId);

}
