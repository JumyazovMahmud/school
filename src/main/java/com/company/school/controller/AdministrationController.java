package com.company.school.controller;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAdministrationDto;
import com.company.school.dto.response.ResponseAdministrationDto;
import com.company.school.service.AdministrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping("administration")
public class AdministrationController {

    private final AdministrationService administrationService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseAdministrationDto>> createAdministration(@RequestBody RequestAdministrationDto dto) {
        return convertStatusCodeByData(this.administrationService.createAdministration(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseAdministrationDto>> getAdministration(@RequestParam(value = "id") Integer administrationId) {
        return convertStatusCodeByData(this.administrationService.getAdministration(administrationId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseAdministrationDto>> updateAdministration(@RequestParam(value = "id") Integer administrationId, @RequestBody RequestAdministrationDto dto) {
        return convertStatusCodeByData(this.administrationService.updateAdministration(administrationId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseAdministrationDto>> deleteAdministration(@RequestParam(value = "id") Integer administrationId) {
        return convertStatusCodeByData(this.administrationService.deleteAdministration(administrationId));
    }
}
