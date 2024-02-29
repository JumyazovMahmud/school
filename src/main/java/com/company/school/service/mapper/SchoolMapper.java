package com.company.school.service.mapper;

import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.entity.School;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , imports = Collectors.class)

public abstract class SchoolMapper {


    @Mapping(target = "schoolId" , ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract School toEntity(RequestSchoolDto dto);


    @Mapping(target = "address" , ignore = true)
    @Mapping(target = "teachers" , ignore = true)
    @Mapping(target = "administrations" , ignore = true)
    public abstract ResponseSchoolDto toDto(School school);

//    public abstract ResponseSchoolDto toDtoWithLists(School school);



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
