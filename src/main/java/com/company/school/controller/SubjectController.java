package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import com.company.school.service.SubjectService;
import com.company.school.util.SimpleRequestCrud;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "subject")
public class SubjectController implements SimpleRequestCrud<Integer, RequestSubjectDto, ResponseSubjectDto> {

    private final SubjectService subjectService;

    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> createEntity(@RequestBody RequestSubjectDto dto) {
        return convertStatusCodeByData(this.subjectService.createEntity(dto));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.subjectService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                        @RequestBody RequestSubjectDto dto) {
        return convertStatusCodeByData(this.subjectService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSubjectDto>> deleteEntity(@RequestParam Integer entityId) {
        return convertStatusCodeByData(this.subjectService.deleteEntity(entityId));
    }
}
