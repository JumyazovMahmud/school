package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.service.StudentService;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Override
    public ResponseDto<ResponseStudentDto> createStudent(RequestStudentDto student) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentDto> getStudent(Integer studentId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentDto> updateStudent(Integer studentId, RequestStudentDto student) {
        return null;
    }

    @Override
    public ResponseDto<ResponseStudentDto> deleteStudent(Integer studentId) {
        return null;
    }
}
