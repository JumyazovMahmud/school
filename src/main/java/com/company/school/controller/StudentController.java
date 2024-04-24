package com.company.school.controller;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "student")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseStudentDto>> createStudent(@RequestBody RequestStudentDto dto) {
        return convertStatusCodeByData(this.studentService.createStudent(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseStudentDto>> getStudent(@RequestParam(value = "id") Integer studentId) {
        return convertStatusCodeByData(this.studentService.getStudent(studentId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseStudentDto>> updateStudent(@RequestParam(value = "id") Integer studentId,@RequestBody RequestStudentDto dto) {
        return convertStatusCodeByData(this.studentService.updateStudent(studentId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseStudentDto>> deleteStudent(@RequestParam(value = "id") Integer studentId) {
        return convertStatusCodeByData(this.studentService.deleteStudent(studentId));
    }


}
