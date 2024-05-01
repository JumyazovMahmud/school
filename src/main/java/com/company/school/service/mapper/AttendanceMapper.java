package com.company.school.service.mapper;

import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import com.company.school.entity.Attendance;
import org.springframework.stereotype.Component;

@Component
public class AttendanceMapper {

    public Attendance toEntity(RequestAttendanceDto dto){
        return Attendance.builder()
                .absent(dto.getAbsent())
                .date(dto.getDate())
                .build();
    }

    public ResponseAttendanceDto toDto(Attendance attendance) {
        return ResponseAttendanceDto.builder()
                .absent(attendance.getAbsent())
                .date(attendance.getDate())
                .createdAt(attendance.getCreatedAt())
                .updatedAt(attendance.getUpdatedAt())
                .deletedAt(attendance.getDeletedAt())
                .teacherId(attendance.getTeacherId())
                .attendanceId(attendance.getAttendanceId())
                .clazz(attendance.getClazz())
                .build();
    }

    public Attendance update(RequestAttendanceDto dto, Attendance attendance){
        if (dto.getDate() != null){
            attendance.setDate(dto.getDate());
        }
        if (dto.getAbsent() != null){
            attendance.setAbsent(dto.getAbsent());
        }
        return attendance;
    }
}
