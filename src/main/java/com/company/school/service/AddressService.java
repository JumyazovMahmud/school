package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    ResponseDto<ResponseAddressDto> createEntity(RequestAddressDto dto);

    ResponseDto<ResponseAddressDto> getEntity(Integer entityId);

    ResponseDto<ResponseAddressDto> updateEntity(Integer entityId, RequestAddressDto dto);

    ResponseDto<ResponseAddressDto> deleteEntity(Integer entityId);
}
