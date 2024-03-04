package com.company.school.service.mapper;

import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import com.company.school.entity.Administration;
import com.company.school.entity.Attendance;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = Collectors.class)
public abstract class AttendanceMapper {


    @Mapping(target = "attendanceId", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    public abstract Attendance toEntity(RequestAttendanceDto dto);

    public abstract ResponseAttendanceDto toDto(Attendance attendance);


    @Mapping(target = "attendanceId", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Attendance.class)
    public abstract Attendance updateAttendance(RequestAttendanceDto dto, @MappingTarget Attendance attendance);

}
