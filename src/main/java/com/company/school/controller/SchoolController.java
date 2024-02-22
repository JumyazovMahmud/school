package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.util.SCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "school")
public class SchoolController implements SCrud<ResponseSchoolDto,Integer, RequestSchoolDto> {
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> create(RequestSchoolDto request) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> get(Integer entityId) {
        return null;
    }

    @Override
    @PutMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> update(Integer entityId, RequestSchoolDto request) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> delete(Integer entityId) {
        return null;
    }
}
