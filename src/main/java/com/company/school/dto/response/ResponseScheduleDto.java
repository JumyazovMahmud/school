package com.company.school.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ResponseScheduleDto {
    private Integer scheduleId;

    private Integer hours;

    private String subject;

    private Integer studentId;

    private Integer teacherId;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;


    private LocalDateTime deletedAt;
}
