package com.company.school.service.mapper;

import com.company.school.dto.response.ResponseScheduleDto;
import com.company.school.entity.Schedule;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , imports = Collectors.class)
public abstract class ScheduleMapper {

    @Mapping(target = "scheduleId" , ignore = true)
    @Mapping(target = "subject" , ignore = true)
    public abstract Schedule toEntity(ResponseScheduleDto dto);

    @Mapping(target = "subject" , ignore = true)
    public abstract ResponseScheduleDto toDto(Schedule schedule);

    @Mapping(target = "scheduleId" , ignore = true)
    @Mapping(target = "subject" , ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Schedule.class)
    public abstract Schedule updateSchedule(@MappingTarget Schedule schedule , ResponseScheduleDto dto);

}
