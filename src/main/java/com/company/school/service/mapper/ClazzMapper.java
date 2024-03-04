package com.company.school.service.mapper;

import com.company.school.dto.request.RequestClassDto;
import com.company.school.dto.response.ResponseClassDto;
import com.company.school.entity.Clazz;
import com.company.school.entity.template.AbsEntity;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
@RequiredArgsConstructor
public abstract class ClazzMapper {

    @Mapping(target = "classId", ignore = true)
    @Mapping(target = "teacherSchedule", ignore = true)
    public abstract Clazz toEntity(RequestClassDto dto);

    @Mapping(target = "teacherSchedule", ignore = true)
    public abstract ResponseClassDto toDto(Clazz clazz);

//    @Mapping(target = "teacherSchedule", ignore = true)
//    public abstract ResponseClassDto toDtoWithClass(Clazz clazz);

    @Mapping(target = "classId", ignore = true)
    @Mapping(target = "teacherSchedule", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Clazz.class)
    public abstract Clazz updateClazz(ResponseClassDto dto, @MappingTarget Clazz clazz);

}
