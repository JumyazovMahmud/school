package com.company.school.service.mapper;

import com.company.school.dto.request.RequestAddressDto;
import com.company.school.dto.response.ResponseAddressDto;
import com.company.school.entity.Address;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.Collection;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class AddressMapper {

    @Mapping(target = "addressId", ignore = true)
    public abstract Address toEntity(RequestAddressDto dto);

    public abstract ResponseAddressDto toDto(Address address);

    @Mapping(target = "addressId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Address.class)
    public abstract Address updateAddress(RequestAddressDto dto, @MappingTarget Address address);


}
