package com.company.school.service.mapper;

import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.entity.Teacher;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public abstract class TeacherMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract Teacher toEntity(RequestTeacherDto dto);

    @Mapping(target = "address",ignore = true)
    @Mapping(target = "attendance",ignore = true)
    @Mapping(target = "subject",ignore = true)
    @Mapping(target = "teacherSchedule",ignore = true)
    @Mapping(target = "roles",ignore = true)
    public abstract ResponseTeacherDto toDto(Teacher entity);


    public abstract ResponseTeacherDto toDtoWithLists(Teacher entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Teacher.class)
    public abstract Teacher update(RequestTeacherDto dto, @MappingTarget Teacher entity);

}
