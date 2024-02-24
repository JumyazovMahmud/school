package com.company.school.service.mapper;

import com.company.school.dto.request.RequestMarksDto;
import com.company.school.dto.response.ResponseMarksDto;
import com.company.school.entity.Marks;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = Collectors.class)
public abstract class MarksMapper {

    @Mapping(target = "marksId", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    public abstract Marks toEntity(RequestMarksDto dto);

    public abstract ResponseMarksDto toDto(Marks marks);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Marks.class)
    public abstract Marks updateMarks(RequestMarksDto dto, @MappingTarget Marks marks);


}
