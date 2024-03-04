package com.company.school.service.mapper;

import com.company.school.dto.request.RequestMarksDto;
import com.company.school.dto.response.ResponseMarksDto;
import com.company.school.entity.Marks;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class MarksMapper {

    @Mapping(target = "marksId", ignore = true)
    public abstract Marks toEntity(RequestMarksDto dto);

    public abstract ResponseMarksDto toDto(Marks marks);

    @Mapping(target = "marksId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Marks.class)
    public abstract Marks updateMarks(RequestMarksDto dto, @MappingTarget Marks marks);


}
