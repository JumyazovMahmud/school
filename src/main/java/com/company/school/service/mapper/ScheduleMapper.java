package com.company.school.service.mapper;

import com.company.school.dto.response.ResponseScheduleDto;
import com.company.school.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , imports = Collectors.class)
public abstract class ScheduleMapper {

    @Mapping(target = "scheduleId" , ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    public abstract Schedule toEntity(ResponseScheduleDto dto);


    public abstract ResponseScheduleDto toDto(Schedule schedule);

//    @Mapping(target = "scheduleId" , ignore = true)
//    @Mapping(target = "createdAt",ignore = true)
//    @Mapping(target = "updatedAt",ignore = true)
//    @Mapping(target = "deletedAt",ignore = true)
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    public abstract Schedule updateSchedule(Schedule schedule , ResponseScheduleDto dto);
}
