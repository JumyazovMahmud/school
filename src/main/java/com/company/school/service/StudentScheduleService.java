package com.company.school.service;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentScheduleDto;
import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseStudentScheduleDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentScheduleService {

    ResponseDto<ResponseStudentScheduleDto> create(RequestStudentScheduleDto request);

    ResponseDto<ResponseStudentScheduleDto> get(Integer entityId);

    ResponseDto<ResponseStudentScheduleDto> update(Integer entityId , RequestStudentScheduleDto request);

    ResponseDto<ResponseStudentScheduleDto> delete(Integer entityId);


}
