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

    @NotBlank
    private String subjectName;

    @NotNull
    private Integer teacherId;


    @NotBlank
    private String floor;

}
