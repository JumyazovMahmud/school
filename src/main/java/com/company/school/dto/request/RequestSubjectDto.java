package com.company.school.dto.request;

import jakarta.persistence.Basic;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestSubjectDto {

    @NotBlank(message = "SubjectName cannot be null or empty")
    private String subjectName;

    @NotNull(message = "Teacher id cannot be null")
    private Integer teacherId;

    @NotBlank(message = "Floor cannot be null")
    private String floor;

}
