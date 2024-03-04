package com.company.school.service.mapper;

import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import com.company.school.entity.Administration;
import com.company.school.entity.Attendance;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class AttendanceMapper {


    @Mapping(target = "attendanceId", ignore = true)
    public abstract Attendance toEntity(RequestAttendanceDto dto);

    public abstract ResponseAttendanceDto toDto(Attendance attendance);


    @Mapping(target = "attendanceId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Attendance.class)
    public abstract Attendance updateAttendance(RequestAttendanceDto dto, @MappingTarget Attendance attendance);

}
