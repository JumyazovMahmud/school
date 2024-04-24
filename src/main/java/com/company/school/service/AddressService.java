package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

    ResponseDto<ResponseAddressDto> createAddress(RequestAddressDto address);

    ResponseDto<ResponseAddressDto> getAddress(Integer addressId);

    ResponseDto<ResponseAddressDto> updateAddress(Integer addressId, RequestAddressDto address);

    ResponseDto<ResponseAddressDto> deleteAddress(Integer addressId);


}
