package com.company.school.service.mapper;


import com.company.school.dto.request.RequestStudentScheduleDto;
import com.company.school.dto.response.ResponseStudentScheduleDto;
import com.company.school.entity.StudentSchedule;
import org.springframework.stereotype.Component;

@Component
public class StudentScheduleMapper {


    public StudentSchedule toEntity(RequestStudentScheduleDto dto){
        return StudentSchedule.builder()
                .build();
    }

    public ResponseStudentScheduleDto toDto(StudentSchedule schedule){
        return ResponseStudentScheduleDto.builder()
                .studentId(schedule.getStudentId())
                .scheduleStudentId(schedule.getStudentScheduleId())
                .classId(schedule.getClassId())
                .createdAt(schedule.getCreatedAt())
                .updatedAt(schedule.getUpdatedAt())
                .deletedAt(schedule.getDeletedAt())
//                .scheduleList(schedule.setSchedule())
                .build();
    }

    public StudentSchedule update(RequestStudentScheduleDto dto, StudentSchedule schedule){
        return null;
    }

}
