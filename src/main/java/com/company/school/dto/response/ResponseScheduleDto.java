package com.company.school.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseScheduleDto {

    private Integer scheduleId;
    private Integer hours;
    private Integer studentId;
    private Integer teacherId;
    private String subjectName;

    private List<ResponseClazzDto> clazzList;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
