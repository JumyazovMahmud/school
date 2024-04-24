package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.service.TeacherService;
import org.springframework.stereotype.Component;

@Component
public class TeacherServiceImpl implements TeacherService {


    @Override
    public ResponseDto<ResponseTeacherDto> createTeacher(RequestTeacherDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherDto> getTeacher(Integer teacherId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherDto> updateTeacher(Integer teacherId, RequestTeacherDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseTeacherDto> deleteTeacher(Integer teacherId) {
        return null;
    }
}
