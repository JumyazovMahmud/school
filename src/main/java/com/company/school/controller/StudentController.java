package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.service.StudentService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "student")
public class StudentController implements SimpleRequestCrud<Integer, RequestStudentDto, ResponseStudentDto> {
    private final StudentService studentService;


    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseStudentDto>> createEntity(@RequestBody RequestStudentDto dto) {
        return convertStatusCodeByData(this.studentService.createEntity(dto));
    }


    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseStudentDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.studentService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseStudentDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                        @RequestBody RequestStudentDto dto) {
        return convertStatusCodeByData(this.studentService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseStudentDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.studentService.deleteEntity(entityId));
    }
}
