package com.company.school.service.mapper;

import com.company.school.dto.request.RequestClassDto;
import com.company.school.dto.response.ResponseClassDto;
import com.company.school.entity.Administration;
import com.company.school.entity.Clazz;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = Collectors.class)
@RequiredArgsConstructor
public abstract class ClassMapper {

//    private final AttendanceMapper attendanceMapper;

//    @Mapping(target = "classId")
//    @Mapping(target = "teacherSchedule")
//    @Mapping(target = "createdAt")
//    @Mapping(target = "updatedAt")
//    @Mapping(target = "deletedAt")
    public abstract Clazz toEntity(RequestClassDto dto);

    @Mapping(target = "teacherSchedule", ignore = true)
    public abstract ResponseClassDto toDto(Clazz clazz);

//    @Mapping(target = "teacherSchedule", expression = "java(this.attendanceMapper.toDto)")
    public abstract ResponseClassDto toDtoWithClass(Clazz clazz);

    @Mapping(target = "classId")
    @Mapping(target = "teacherSchedule")
    @Mapping(target = "createdAt")
    @Mapping(target = "updatedAt")
    @Mapping(target = "deletedAt")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Clazz.class)
    public abstract Clazz updateClazz(ResponseClassDto dto, @MappingTarget Clazz clazz);

}
