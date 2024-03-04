package com.company.school.service.mapper;

import com.company.school.dto.request.RequestStudentScheduleDto;
import com.company.school.dto.response.ResponseStudentScheduleDto;
import com.company.school.entity.StudentSchedule;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class})
public abstract class StudentScheduleMapper {

    @Mapping(target = "scheduleStudentId", ignore = true)
    public abstract StudentSchedule toEntity(RequestStudentScheduleDto dto);

    //    @Mapping(target = "scheduleList",ignore = true)
    @Mapping(target = "lessons", ignore = true)
    public abstract ResponseStudentScheduleDto toDto(StudentSchedule entity);

//    @Mapping(target = "lessons", ignore = true)
//    public abstract ResponseStudentScheduleDto toDtoWithSchedule(StudentSchedule entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = StudentSchedule.class)
    public abstract StudentSchedule update(RequestStudentScheduleDto dto, @MappingTarget StudentSchedule entity);

}
