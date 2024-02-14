package com.company.school.dto.request;

import jakarta.persistence.Basic;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestSubjectDto {

    private String subjectName;

    private Integer teacherId;

    private String floor;

}
