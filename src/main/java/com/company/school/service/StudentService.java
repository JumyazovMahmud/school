package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    ResponseDto<ResponseStudentDto> createStudent(RequestStudentDto student);

    ResponseDto<ResponseStudentDto> getStudent(Integer studentId);

    ResponseDto<ResponseStudentDto> updateStudent(Integer studentId, RequestStudentDto student);

    ResponseDto<ResponseStudentDto> deleteStudent(Integer studentId);


}
