package com.company.school.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestClazzDto {

    @NotNull(message = "Teacher id cannot be null")
    private Integer teacherId;

    @NotNull(message = "Student id cannot be null")
    private Integer studentId;

    @NotNull(message = "Mentor id cannot be null")
    private Integer mentorId;

    @NotNull(message = "Room id cannot be null")
    private Integer roomId;

    private boolean status;

}
