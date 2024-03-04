package com.company.school.service.mapper;

import com.company.school.dto.request.RequestAdminstrationDto;
import com.company.school.dto.response.ResponseAdminstrationDto;
import com.company.school.entity.Address;
import com.company.school.entity.Administration;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class AdministrationMapper {

    @Mapping(target = "administrationId", ignore = true)
    public abstract Administration toEntity(RequestAdminstrationDto dto);

    public abstract ResponseAdminstrationDto toDto(Administration administration);

    @Mapping(target = "administrationId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Administration.class)
    public abstract Administration updateAdministration(RequestAdminstrationDto dto, @MappingTarget Administration administration);

}
