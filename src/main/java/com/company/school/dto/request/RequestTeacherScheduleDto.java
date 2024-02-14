package com.company.school.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestTeacherScheduleDto {

    private Integer classId;

    private Integer teacherId;
}
