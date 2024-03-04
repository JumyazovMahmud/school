package com.company.school.service.mapper;

import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseTeacherScheduleDto;
import com.company.school.entity.TeacherSchedule;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = Collectors.class)
public abstract class TeacherScheduleMapper {

    @Mapping(target = "teacherScheduleId",ignore = true)
    public abstract TeacherSchedule toEntity(RequestTeacherScheduleDto dto);

    @Mapping(target = "teacherScheduleId",ignore = true)
    @Mapping(target = "scheduleList",ignore = true)
    public abstract ResponseTeacherScheduleDto toDto(TeacherSchedule entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,resultType = TeacherSchedule.class)
    public abstract TeacherSchedule update(RequestTeacherScheduleDto dto, @MappingTarget TeacherSchedule entity);

}
