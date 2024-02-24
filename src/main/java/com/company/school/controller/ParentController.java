package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import com.company.school.service.ParentService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "parent")
public class ParentController implements SimpleRequestCrud<Integer, RequestParentDto, ResponseParentDto> {

    private final ParentService parentService;


    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseParentDto>> createEntity(@RequestBody RequestParentDto dto) {
        return convertStatusCodeByData(this.parentService.createEntity(dto));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseParentDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.parentService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseParentDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                       @RequestBody RequestParentDto dto) {
        return convertStatusCodeByData(this.parentService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseParentDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.parentService.deleteEntity(entityId));
    }
}
