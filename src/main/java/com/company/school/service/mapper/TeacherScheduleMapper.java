package com.company.school.service.mapper;

import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseTeacherScheduleDto;
import com.company.school.entity.TeacherSchedule;
import org.springframework.stereotype.Component;


@Component
public class TeacherScheduleMapper {

    public TeacherSchedule toEntity(RequestTeacherScheduleDto dto){
        return TeacherSchedule.builder()
                .build();
    }

    public ResponseTeacherScheduleDto toDto(TeacherSchedule schedule){
        return ResponseTeacherScheduleDto.builder()
                .teacherScheduleId(schedule.getTeacherScheduleId())
                .teacherId(schedule.getTeacherId())
                .classId(schedule.getClassId())
                .createdAt(schedule.getCreatedAt())
                .updatedAt(schedule.getUpdatedAt())
                .deletedAt(schedule.getDeletedAt())
//                .scheduleList(schedule.getSchedule())
                .build();
    }

    public TeacherSchedule update(RequestTeacherScheduleDto dto, TeacherSchedule schedule){
        return null;
    }


}
