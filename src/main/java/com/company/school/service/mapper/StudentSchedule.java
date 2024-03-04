package com.company.school.service.mapper;

import com.company.school.dto.request.RequestStudentScheduleDto;
import com.company.school.dto.response.ResponseStudentScheduleDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public abstract class StudentSchedule {

    @Mapping(target = "scheduleStudentId",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract StudentSchedule toEntity(RequestStudentScheduleDto dto);

    @Mapping(target = "scheduleList",ignore = true)
    public abstract ResponseStudentScheduleDto toDto(StudentSchedule entity);

    @Mapping(target = "lessons")
    public abstract ResponseStudentScheduleDto toDtoWithSchedule(StudentSchedule entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = StudentSchedule.class)
    public abstract StudentSchedule update(RequestStudentScheduleDto dto, @MappingTarget StudentSchedule entity);

}
