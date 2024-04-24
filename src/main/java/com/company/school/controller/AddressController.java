package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "address")
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> createAddress(@RequestBody RequestAddressDto dto) {
        return convertStatusCodeByData(this.addressService.createAddress(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> getAddress(@RequestParam(value = "id") Integer addressId) {
        return convertStatusCodeByData(this.addressService.getAddress(addressId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> updateAddress(@RequestParam(value = "id") Integer addressId,@RequestBody RequestAddressDto dto) {
        return convertStatusCodeByData(this.addressService.updateAddress(addressId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseAddressDto>> deleteAddress(@RequestParam(value = "id") Integer addressId) {
        return convertStatusCodeByData(this.addressService.deleteAddress(addressId));
    }
}
