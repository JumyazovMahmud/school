package com.company.school.service.mapper;


import com.company.school.dto.request.RequestScheduleDto;
import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseScheduleDto;
import com.company.school.entity.Schedule;
import org.springframework.stereotype.Component;

@Component
public class ScheduleMapper {

    public Schedule toEntity(RequestScheduleDto dto){
        return Schedule.builder()
                .hours(dto.getHours())
                .subjectName(dto.getSubjectName())
                .build();
    }

    public ResponseScheduleDto toDto(Schedule schedule) {
        return ResponseScheduleDto.builder()
                .scheduleId(schedule.getScheduleId())
                .studentId(schedule.getStudentId())
                .subjectName(schedule.getSubjectName())
                .createdAt(schedule.getCreatedAt())
                .updatedAt(schedule.getUpdatedAt())
                .deletedAt(schedule.getDeletedAt())
//                .clazzList()
                .build();
    }

    public Schedule update(RequestScheduleDto dto, Schedule schedule){
        if (dto.getHours() != null){
            schedule.setHours(dto.getHours());
        }
        if (dto.getSubjectName() != null){
            schedule.setHours(dto.getHours());
        }
        return schedule;
    }
}
