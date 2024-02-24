package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestClassDto;
import com.company.school.dto.response.ResponseClassDto;
import com.company.school.service.ClazzService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "class")
public class ClazzController implements SimpleRequestCrud<Integer, RequestClassDto, ResponseClassDto> {
    private final ClazzService clazzService;


    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseClassDto>> createEntity(@RequestBody RequestClassDto dto) {
        return convertStatusCodeByData(this.clazzService.createEntity(dto));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseClassDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.clazzService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseClassDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                      @RequestBody RequestClassDto dto) {
        return convertStatusCodeByData(this.clazzService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseClassDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.clazzService.deleteEntity(entityId));
    }
}
