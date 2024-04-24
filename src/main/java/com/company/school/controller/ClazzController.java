package com.company.school.controller;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestClazzDto;
import com.company.school.dto.response.ResponseClazzDto;
import com.company.school.service.ClazzService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "clazz")
public class ClazzController {

    private final ClazzService clazzService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseClazzDto>> createClazz(@RequestBody RequestClazzDto dto) {
        return convertStatusCodeByData(this.clazzService.createClazz(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseClazzDto>> getClazz(@RequestParam(value = "id") Integer clazzId) {
        return convertStatusCodeByData(this.clazzService.getClazz(clazzId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseClazzDto>> updateClazz(@RequestParam(value = "id") Integer clazzId,@RequestBody RequestClazzDto dto) {
        return convertStatusCodeByData(this.clazzService.updateClazz(clazzId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseClazzDto>> deleteClazz(@RequestParam(value = "id") Integer clazzId) {
        return convertStatusCodeByData(this.clazzService.deleteClazz(clazzId));
    }
}
