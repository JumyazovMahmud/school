package com.company.school.controller;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> createTeacher(@RequestBody RequestTeacherDto dto) {
        return convertStatusCodeByData(this.teacherService.createTeacher(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> getTeacher(@RequestParam(value = "id") Integer teacherId) {
        return convertStatusCodeByData(this.teacherService.getTeacher(teacherId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> updateTeacher(@RequestParam(value = "id") Integer teacherId, @RequestBody RequestTeacherDto dto) {
        return convertStatusCodeByData(this.teacherService.updateTeacher(teacherId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> deleteTeacher(@RequestParam(value = "id") Integer teacherId) {
        return convertStatusCodeByData(this.teacherService.deleteTeacher(teacherId));
    }


}
