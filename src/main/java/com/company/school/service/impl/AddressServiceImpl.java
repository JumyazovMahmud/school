package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.service.AddressService;
import org.springframework.stereotype.Component;

@Component
public class AddressServiceImpl implements AddressService {
    @Override
    public ResponseDto<ResponseAddressDto> createEntity(RequestAddressDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAddressDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAddressDto> updateEntity(Integer entityId, RequestAddressDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseAddressDto> deleteEntity(Integer entityId) {
        return null;
    }
}
