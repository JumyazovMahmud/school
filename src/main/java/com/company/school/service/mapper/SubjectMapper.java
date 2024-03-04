package com.company.school.service.mapper;

import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseSubjectDto;
import com.company.school.entity.Subject;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public abstract class SubjectMapper {

    @Mapping(target = "subjectId",ignore = true)
    public abstract Subject toEntity(RequestSubjectDto dto);

    public abstract ResponseSubjectDto toDto(Subject subject);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Subject.class)
    public abstract Subject updateSubject(RequestSubjectDto dto,@MappingTarget Subject subject);

}
