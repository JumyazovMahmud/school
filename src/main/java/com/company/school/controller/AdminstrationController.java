package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdminstrationDto;
import com.company.school.dto.response.ResponseAdminstrationDto;
import com.company.school.service.AdminstrationService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RequestMapping(value = "adminstration")
@RestController
@RequiredArgsConstructor
public class AdminstrationController implements SimpleRequestCrud<Integer , RequestAdminstrationDto , ResponseAdminstrationDto> {

    private final AdminstrationService adminstrationService;
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseAdminstrationDto>> createEntity(@RequestBody RequestAdminstrationDto entity) {
        return convertStatusCodeByData(this.adminstrationService.createEntity(entity));
    }

    @Override
    @GetMapping
    public ResponseEntity<ResponseDto<ResponseAdminstrationDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.adminstrationService.getEntity(entityId));
    }

    @Override
    @PutMapping
    public ResponseEntity<ResponseDto<ResponseAdminstrationDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                              @RequestBody RequestAdminstrationDto entity) {
        return convertStatusCodeByData(this.adminstrationService.updateEntity(entityId , entity));
    }

    @Override
    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseAdminstrationDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.adminstrationService.deleteEntity(entityId));
    }
}
