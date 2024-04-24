package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "school")
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> createSchool(@RequestBody RequestSchoolDto dto){
        return convertStatusCodeByData(this.schoolService.createSchool(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> getSchool(@RequestParam(value = "id") Integer schoolId){
        return convertStatusCodeByData(this.schoolService.getSchool(schoolId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> updateSchool(@RequestParam(value = "id") Integer schoolId, @RequestBody RequestSchoolDto dto){
        return convertStatusCodeByData(this.schoolService.updateSchool(schoolId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> deleteSchool(@RequestParam(value = "id") Integer schoolId){
        return convertStatusCodeByData(this.schoolService.deleteSchool(schoolId));
    }
}
