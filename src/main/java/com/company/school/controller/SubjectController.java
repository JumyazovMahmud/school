package com.company.school.controller;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import com.company.school.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "subject")
public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> createSubject(@RequestBody RequestSubjectDto dto){
        return convertStatusCodeByData(this.subjectService.createSubject(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> getSubject(@RequestParam(value = "id") Integer subjectId){
        return convertStatusCodeByData(this.subjectService.getSubject(subjectId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> updateSubject(@RequestParam(value = "id") Integer subjectId,@RequestBody RequestSubjectDto dto){
        return convertStatusCodeByData(this.subjectService.updateSubject(subjectId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> deleteSubject(@RequestParam(value = "id") Integer subjectId){
        return convertStatusCodeByData(this.subjectService.deleteSubject(subjectId));
    }


}
