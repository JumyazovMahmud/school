package com.company.school.service.mapper;

import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.entity.Teacher;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class TeacherMapper {

    @Mapping(target = "teacherId", ignore = true)
    public abstract Teacher toEntity(RequestTeacherDto dto);

    public abstract ResponseTeacherDto toDto(Teacher teacher);


    @Mapping(target = "teacherId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Teacher.class)
    public abstract Teacher updateTeacher(RequestTeacherDto dto,  @MappingTarget Teacher teacher);

}
