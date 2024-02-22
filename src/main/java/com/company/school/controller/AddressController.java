package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.util.SCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "address")
public class AddressController implements SCrud<ResponseAddressDto,Integer, RequestAddressDto> {
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> create(RequestAddressDto request) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> get(Integer entityId) {
        return null;
    }

    @Override
    @PutMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> update(Integer entityId, RequestAddressDto request) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> delete(Integer entityId) {
        return null;
    }
}
