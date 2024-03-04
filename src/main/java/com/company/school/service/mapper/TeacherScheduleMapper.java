package com.company.school.service.mapper;

import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseTeacherScheduleDto;
import com.company.school.entity.TeacherSchedule;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public abstract class TeacherScheduleMapper {

    @Mapping(target = "teacherScheduleId",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract TeacherSchedule toEntity(RequestTeacherScheduleDto dto);

    @Mapping(target = "teacherScheduleId",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract ResponseTeacherScheduleDto toDto(TeacherSchedule entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,resultType = TeacherSchedule.class)
    public abstract TeacherSchedule update(RequestTeacherScheduleDto dto, @MappingTarget TeacherSchedule entity);

}
