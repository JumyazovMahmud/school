package com.company.school.mapper;


import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import com.company.school.entity.Parent;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , imports = Collectors.class)
@RequiredArgsConstructor
public abstract class ParentMapper {

//    private final StudentMapper studentMapper;


    //todo: TeacherMapper


    @Mapping(target = "parentId" , ignore = true)
    @Mapping(target = "createdAt" , ignore = true)
    @Mapping(target = "updatedAt" , ignore = true)
    @Mapping(target = "deletedAt" , ignore = true)
    @Mapping(target = "students" , ignore = true)
    @Mapping(target = "teacher" , ignore = true)
    public abstract Parent toEntity(RequestParentDto dto);

    @Mapping(target = "students" , ignore = true)
    @Mapping(target = "teacher" , ignore = true)
    public abstract ResponseParentDto toDto(Parent parent);

//    @Mapping(target = "students" , expression = "java( parent.getStudents().stream().map(this.studentMapper::toDto).toList() )")
//    @Mapping(target = "teacher" , expression = "java( this.teacherMapper.toDto(parent.getTeacher()) )")
    public abstract ResponseParentDto toDtoWithLists(Parent parent);



    @Mapping(target = "parentId" , ignore = true)
    @Mapping(target = "students" , ignore = true)
    @Mapping(target = "teacher" , ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,resultType = Parent.class)
    public abstract Parent updateParent(@MappingTarget Parent parent , ResponseParentDto dto);
}
