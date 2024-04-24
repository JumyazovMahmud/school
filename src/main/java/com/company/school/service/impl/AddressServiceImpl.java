package com.company.school.service.impl;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.service.AddressService;
import org.springframework.stereotype.Component;

@Component
public class AddressServiceImpl implements AddressService {


    @Override
    public ResponseDto<ResponseAddressDto> createAddress(RequestAddressDto address) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAddressDto> getAddress(Integer addressId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAddressDto> updateAddress(Integer addressId, RequestAddressDto address) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAddressDto> deleteAddress(Integer addressId) {
        return null;
    }
}
