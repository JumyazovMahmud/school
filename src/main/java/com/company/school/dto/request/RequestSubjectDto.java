package com.company.school.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestSubjectDto {

    @NotBlank(message = "SubjectName cannot be null or empty")
    private String subjectName;

    @NotNull(message = "Teacher id cannot be null")
    private Integer teacherId;

    @NotBlank(message = "Floor cannot be null")
    private String floor;

    private boolean active;

}
