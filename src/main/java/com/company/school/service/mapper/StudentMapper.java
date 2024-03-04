package com.company.school.service.mapper;

import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.entity.Student;
import com.company.school.entity.template.AbsEntity;
import org.mapstruct.*;

import java.util.stream.Collectors;

@Mapper(componentModel = "spring", imports = {Collectors.class, AbsEntity.class})
public abstract class StudentMapper {

    @Mapping(target = "studentId", ignore = true)
    public abstract Student toEntity(RequestStudentDto dto);

    public abstract ResponseStudentDto toDto(Student student);

    @Mapping(target = "studentId", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, resultType = Student.class)
    public abstract Student updateStudent(RequestStudentDto dto, @MappingTarget Student student);
}
