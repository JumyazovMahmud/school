package com.company.school.service.mapper;

import com.company.school.dto.request.RequestTeacherRolesDto;
import com.company.school.dto.response.ResponseTeacherRolesDto;
import com.company.school.entity.TeacherRole;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public abstract class TeacherRoleMapper {

    @Mapping(target = "id",ignore = true)
    public abstract TeacherRole toEntity(RequestTeacherRolesDto dto);

    @Mapping(target = "id",ignore = true)
    public abstract ResponseTeacherRolesDto toDto(TeacherRole role);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,resultType = TeacherRole.class )
    public abstract TeacherRole update(RequestTeacherRolesDto dto, @MappingTarget TeacherRole role);
}
