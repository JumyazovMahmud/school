package com.company.school.service.mapper;


import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    @Lazy
    @Autowired
    AddressMapper addressMapper;

    @Lazy
    @Autowired
    SubjectMapper subjectMapper;

    @Lazy
    @Autowired
    TeacherScheduleMapper teacherScheduleMapper;

    @Lazy
    @Autowired
    SchoolMapper schoolMapper;

    public Teacher toEntity(RequestTeacherDto dto){
        return Teacher.builder()
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }

    public ResponseTeacherDto toDto(Teacher teacher){
        return ResponseTeacherDto.builder()
                .teacherId(teacher.getTeacherId())
                .schoolId(teacher.getSchoolId())
                .firstname(teacher.getFirstname())
                .lastname(teacher.getLastname())
                .email(teacher.getEmail())
                .password(teacher.getPassword())
                .phoneNumber(teacher.getPhoneNumber())
                .createdAt(teacher.getCreatedAt())
                .updatedAt(teacher.getUpdatedAt())
                .deletedAt(teacher.getDeletedAt())
//                .address(this.addressMapper.toDto(teacher.getAddress()))
//                .subject(this.subjectMapper.toDto(teacher.getSubject()))
//                .teacherSchedule(teacher.getTeacherSchedule().stream().map(this.teacherSchedule::toDto).collect(Collectors.toList()))
//                .school(this.schoolMapper.toDto(teacher.getSchool()))
                .build();
    }

    public Teacher update(RequestTeacherDto dto, Teacher teacher){
        if (dto.getFirstname() != null){
            teacher.setFirstname(dto.getFirstname());
        }
        if (dto.getLastname() != null){
            teacher.setLastname(dto.getLastname());
        }
        if (dto.getEmail() != null){
            teacher.setEmail(dto.getEmail());
        }
        if (dto.getPassword() != null){
            teacher.setPassword(dto.getPassword());
        }
        if (dto.getPhoneNumber() != null){
            teacher.setPhoneNumber(dto.getPhoneNumber());
        }
        return teacher;
    }
}
