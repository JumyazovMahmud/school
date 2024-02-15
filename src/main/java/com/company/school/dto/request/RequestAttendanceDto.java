package com.company.school.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RequestAttendanceDto {
    @NotBlank(message = "Attendance class cannot be null or empty")
    private String clas;

    @NotBlank(message = "Attendance absent cannot be null or empty")
    private Integer absent;
    @NotNull(message = "Teacher id of Attendance cannot be null or empty")
    private Integer teacherId;

}
