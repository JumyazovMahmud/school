package com.company.school.service.mapper;

import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseAdminstrationDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.entity.Administration;
import com.company.school.entity.School;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , imports = Collectors.class)
@RequiredArgsConstructor
public abstract class SchoolMapper {


    protected AdministrationMapper administrationMapper;

    protected AddressMapper addressMapper;


    @Mapping(target = "schoolId" , ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract School toEntity(RequestSchoolDto dto);


    @Mapping(target = "address" , ignore = true)
    @Mapping(target = "teachers" , ignore = true)
    @Mapping(target = "administrations" , ignore = true)
    public abstract ResponseSchoolDto toDto(School school);


    @Mapping(target = "administrations" , expression = "java(school.getAdministrations().stream().map(this.administrationMapper::toDto).toList())")
    @Mapping(target = "address" , expression = "java(this.addressMapper.toDto(school.getAddress()))")
    @Mapping(target = "teachers" , ignore = true)
    public abstract ResponseSchoolDto toDtoWithLists(School school);



//    private void simple(School school){
//
//        this.addressMapper.toDto(school.getAddress());
//
//        List<ResponseAdminstrationDto> list = ;
//    }



    @Mapping(target = "schoolId" , ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    @Mapping(target = "address" , ignore = true)
    @Mapping(target = "teachers" , ignore = true)
    @Mapping(target = "administrations" , ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE , resultType = School.class)
    public abstract School updateSchool(@MappingTarget School school , RequestSchoolDto dto);
}
