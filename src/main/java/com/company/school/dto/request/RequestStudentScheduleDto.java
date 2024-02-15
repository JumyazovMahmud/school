package com.company.school.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestStudentScheduleDto {

    @NotNull(message = "Class id cannot be null")
    private Integer classId;

    @NotNull(message = "Student id cannot be null")
    private Integer studentId;



}
