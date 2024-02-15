package com.company.school.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestStudentScheduleDto {

    @NotNull
    private Integer classId;

    @NotNull
    private Integer studentId;



}
