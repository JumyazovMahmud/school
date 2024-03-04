package com.company.school.service.mapper;

import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.entity.School;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class SchoolMapper {


    @Mapping(target = "schoolId", ignore = true)
    public abstract School toEntity(RequestSchoolDto dto);

    public abstract ResponseSchoolDto toDto(School school);

    @Mapping(target = "schoolId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = School.class)
    public abstract School updateSchool(RequestSchoolDto dto, @MappingTarget School school);
}
