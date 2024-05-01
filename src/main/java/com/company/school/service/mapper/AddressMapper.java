package com.company.school.service.mapper;

import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address toEntity(RequestAddressDto dto){
        return Address.builder()
                .addressNumber(dto.getAddressNumber())
                .city(dto.getCity())
                .district(dto.getDistrict())
                .street(dto.getStreet())
                .zipCode(dto.getZipCode())
                .build();
    }

    public ResponseAddressDto toDto(Address address){
        return ResponseAddressDto.builder()
                .addressId(address.getAddressId())
                .addressNumber(address.getAddressNumber())
                .city(address.getCity())
                .district(address.getDistrict())
                .street(address.getStreet())
                .schoolId(address.getSchoolId())
                .createdAt(address.getCreatedAt())
                .updatedAt(address.getUpdatedAt())
                .deletedAt(address.getDeletedAt())
                .build();
    }

    public Address update(RequestAddressDto dto, Address address){
        if (dto.getAddressNumber() != null){
            address.setAddressNumber(dto.getAddressNumber());
        }
        if (dto.getCity() != null){
            address.setCity(dto.getCity());
        }
        if (dto.getDistrict() != null){
            address.setDistrict(dto.getDistrict());
        }
        if (dto.getStreet() != null){
            address.setStreet(dto.getStreet());
        }
        if (dto.getZipCode() != null){
            address.setZipCode(dto.getZipCode());
        }
        return address;
    }
}
