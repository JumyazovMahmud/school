package com.company.school.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestTeacherScheduleDto {


    @NotNull
    private Integer classId;

    @NotNull
    private Integer teacherId;
}
