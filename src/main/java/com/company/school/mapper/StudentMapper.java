package com.company.school.mapper;

import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.entity.Parent;
import com.company.school.entity.Student;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring" , imports = Collectors.class)
@RequiredArgsConstructor
public abstract class StudentMapper {

    @Mapping(target = "subject" , ignore = true)
    @Mapping(target = "marks" , ignore = true)
    public abstract ResponseStudentDto toDto(Student student);


//    public abstract ResponseStudentDto toDtoWithLists(Student student);


    public abstract Student toEntity(RequestStudentDto dto);


    @Mapping(target = "subject" , ignore = true)
    @Mapping(target = "marks" , ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE , resultType = Student.class)
    public abstract Student updateStudent(@MappingTarget Student student , RequestStudentDto dto);
}

