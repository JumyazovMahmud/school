package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestMarksDto;
import com.company.school.dto.response.ResponseMarksDto;
import com.company.school.service.MarksService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "marks")
public class MarksController implements SimpleRequestCrud<Integer, RequestMarksDto, ResponseMarksDto> {

    private final MarksService marksService;
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseMarksDto>> createEntity(@RequestBody RequestMarksDto entity) {
        return convertStatusCodeByData(this.marksService.createEntity(entity));
    }

    @Override
    @GetMapping
    public ResponseEntity<ResponseDto<ResponseMarksDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.marksService.getEntity(entityId));
    }

    @Override
    @PutMapping
    public ResponseEntity<ResponseDto<ResponseMarksDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                      @RequestBody RequestMarksDto entity) {
        return convertStatusCodeByData(this.marksService.updateEntity(entityId, entity));
    }

    @Override
    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseMarksDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.marksService.deleteEntity(entityId));
    }
}
