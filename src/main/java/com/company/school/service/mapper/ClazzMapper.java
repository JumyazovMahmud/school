package com.company.school.service.mapper;

import com.company.school.dto.request.RequestClazzDto;
import com.company.school.dto.response.ResponseClazzDto;
import com.company.school.entity.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClazzMapper {

    @Lazy
    @Autowired
    ScheduleMapper scheduleMapper;

    public Clazz toEntity(RequestClazzDto dto){
        return Clazz.builder()
                .status(dto.isStatus())
                .build();
    }

    public ResponseClazzDto toDto(Clazz clazz){
        return ResponseClazzDto.builder()
                .clazzId(clazz.getClazzId())
                .mentorId(clazz.getTeacherId())
                .roomId(clazz.getRoomId())
                .createdAt(clazz.getCreatedAt())
                .updatedAt(clazz.getUpdatedAt())
                .deletedAt(clazz.getDeletedAt())
                .status(clazz.getStatus())
                .scheduleDto(this.scheduleMapper.toDto(clazz.getSchedule()))
                .build();
    }

    public Clazz update(RequestClazzDto dto, Clazz clazz){
        return null;
    }
}
