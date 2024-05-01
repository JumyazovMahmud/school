package com.company.school.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestAttendanceDto {

    @NotBlank(message = "Class cannot be null or empty")
    private String clazz;

    @NotBlank(message = "Absent cannot be null or empty")
    private Integer absent;

    @NotNull(message = "Teacher id cannot be null")
    private Integer teacherId;

    private LocalDateTime date;

}
