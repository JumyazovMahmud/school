package com.company.school.dto.request;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestScheduleDto {

    private Integer hours;
    private String subjectName;
    private Integer subjectId;
    private Integer teacherId;

}
