package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.service.AddressService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "Address")
public class AddressController implements SimpleRequestCrud<Integer, RequestAddressDto, ResponseAddressDto> {

    private final AddressService addressService;


    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseAddressDto>> createEntity(@RequestBody RequestAddressDto dto) {
        return convertStatusCodeByData(this.addressService.createEntity(dto));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseAddressDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.addressService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseAddressDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                        @RequestBody RequestAddressDto dto) {
        return convertStatusCodeByData(this.addressService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseAddressDto>> deleteEntity(@RequestBody Integer entityId) {
        return convertStatusCodeByData(this.addressService.deleteEntity(entityId));
    }
}
