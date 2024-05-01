package com.company.school.service.mapper;


import com.company.school.dto.request.RequestStudentDto;
import com.company.school.dto.response.ResponseStudentDto;
import com.company.school.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {


    public Student toEntity(RequestStudentDto dto){
        return Student.builder()
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .middleName(dto.getMiddleName())
                .email(dto.getEmail())
                .age(dto.getAge())
                .attended(dto.isAttended())
                .birthDate(dto.getBirthDate())
                .gender(dto.getGender())
                .phoneNumber(dto.getPhoneNumber())
                .parentsPhoneNumber(dto.getParentsPhoneNumber())
                .status(dto.getStatus())
                .password(dto.getPassword())
                .build();
    }

    public ResponseStudentDto toDto(Student student){
        return ResponseStudentDto.builder()
                .studentId(student.getStudentId())
                .age(student.getAge())
                .attended(student.isAttended())
                .firstname(student.getFirstname())
                .lastname(student.getLastname())
                .middleName(student.getMiddleName())
                .email(student.getEmail())
                .password(student.getPassword())
                .phoneNumber(student.getPhoneNumber())
                .parentsPhoneNumber(student.getParentsPhoneNumber())
                .gender(student.getGender())
                .birthDate(student.getBirthDate())
//                .address(student.getAddress())
                .status(student.getStatus())
                .classId(student.getClassId())
                .marksId(student.getMarksId())
                .subjectId(student.getSubjectId())
                .teacherId(student.getTeacherId())
                .createdAt(student.getCreatedAt())
                .updatedAt(student.getUpdatedAt())
                .deletedAt(student.getDeletedAt())
                .build();
    }

    public Student update(RequestStudentDto dto, Student student){
        if (dto.getFirstname() != null){
            student.setFirstname(dto.getFirstname());
        }
        if (dto.getMiddleName() != null){
            student.setMiddleName(dto.getMiddleName());
        }
        if (dto.getLastname() != null){
            student.setLastname(dto.getLastname());
        }
        if (dto.getEmail() != null){
            student.setEmail(dto.getEmail());
        }
        if (dto.getPhoneNumber() != null){
            student.setPhoneNumber(dto.getPhoneNumber());
        }
        if (dto.getParentsPhoneNumber() != null){
            student.setParentsPhoneNumber(dto.getParentsPhoneNumber());
        }
        if (dto.getPassword() != null){
            student.setPassword(dto.getPassword());
        }
//
        return student;
    }
}
