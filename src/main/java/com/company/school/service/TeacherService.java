package com.company.school.service;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {


    ResponseDto<ResponseTeacherDto> createTeacher(RequestTeacherDto dto);

    ResponseDto<ResponseTeacherDto> getTeacher(Integer teacherId);

    ResponseDto<ResponseTeacherDto> updateTeacher(Integer teacherId, RequestTeacherDto dto);

    ResponseDto<ResponseTeacherDto> deleteTeacher(Integer teacherId);
}
