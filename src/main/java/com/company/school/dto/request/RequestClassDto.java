package com.company.school.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestClassDto {

    private Integer id;
    private Integer teacherId;
    private Integer studentId;
    private Integer mentorId;
    private Integer roomId;
    private Boolean status;


}
