package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.SResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.serviceImpl.TeacherServiceImpl;
import com.company.school.util.SCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "teachers")
@RequiredArgsConstructor
public class TeacherController implements SCrud<ResponseTeacherDto , Integer , RequestTeacherDto> {
    private final TeacherServiceImpl teacherService;
    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> create(RequestTeacherDto request) {
        return SResponseDto.convertStatusCodeByData(this.teacherService.create(request));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> get(Integer entityId) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> update(Integer entityId, RequestTeacherDto request) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> delete(Integer entityId) {
        return null;
    }
}
