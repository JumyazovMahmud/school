package com.company.school.dto.response;

import com.company.school.entity.Schedule;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseStudentScheduleDto {

    private Integer scheduleStudentId;
    private List<Schedule> lessons;
    private Integer classId;
    private Integer studentId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;


}
