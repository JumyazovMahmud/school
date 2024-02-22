package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.service.SchoolService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "School")
public class SchoolController implements SimpleRequestCrud<Integer, RequestSchoolDto, ResponseSchoolDto> {
    private final SchoolService schoolService;

    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> createEntity(@RequestBody RequestSchoolDto dto) {
        return convertStatusCodeByData(this.schoolService.createEntity(dto));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.schoolService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                       @RequestBody RequestSchoolDto dto) {
        return convertStatusCodeByData(this.schoolService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseSchoolDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.schoolService.deleteEntity(entityId));
    }
}
