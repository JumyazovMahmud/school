package com.company.school.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseClazzDto {

    private Integer clazzId;
    private Integer teacherId;
    private Integer studentId;
    private Integer mentorId;
    private Integer roomId;
    private Boolean status;
    private ResponseScheduleDto scheduleDto;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
