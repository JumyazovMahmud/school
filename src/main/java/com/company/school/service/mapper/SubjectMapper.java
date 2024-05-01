package com.company.school.service.mapper;


import com.company.school.dto.request.RequestSubjectDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import com.company.school.dto.response.ResponseSubjectDto;
import com.company.school.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class SubjectMapper {

    @Lazy
    @Autowired
    AttendanceMapper attendanceMapper;

    public Subject toEntity(RequestSubjectDto dto){
        return Subject.builder()
                .subjectName(dto.getSubjectName())
                .floor(dto.getFloor())
                .active(dto.isActive())
                .build();
    }

    public ResponseSubjectDto toDto(Subject subject) {
        return ResponseSubjectDto.builder()
                .subjectId(subject.getSubjectId())
                .teacherId(subject.getTeacherId())
                .subjectName(subject.getSubjectName())
                .floor(subject.getFloor())
                .active(subject.isActive())
                .mark(subject.getMark())
                .attendance(this.attendanceMapper.toDto(subject.getAttendance()))
                .createdAt(subject.getCreatedAt())
                .updatedAt(subject.getUpdatedAt())
                .deletedAt(subject.getDeletedAt())
                .build();
    }

    public Subject update(RequestSubjectDto dto, Subject subject){
        return null;
    }

}
