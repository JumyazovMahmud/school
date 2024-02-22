package com.company.school.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestTeacherScheduleDto {


    @NotNull(message = "Class id cannot be null")
    private Integer classId;

    @NotNull(message = "Teacher id cannot be null")
    private Integer teacherId;
}
