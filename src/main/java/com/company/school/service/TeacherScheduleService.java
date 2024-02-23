package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.dto.response.ResponseTeacherScheduleDto;
import org.springframework.stereotype.Service;

@Service
public interface TeacherScheduleService {

    ResponseDto<ResponseTeacherScheduleDto> create(RequestTeacherScheduleDto request);

    ResponseDto<ResponseTeacherScheduleDto> get(Integer entityId);

    ResponseDto<ResponseTeacherScheduleDto> update(Integer entityId , RequestTeacherScheduleDto request);

    ResponseDto<ResponseTeacherScheduleDto> delete(Integer entityId);
}
