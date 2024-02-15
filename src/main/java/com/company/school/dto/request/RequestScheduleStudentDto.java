package com.company.school.dto.request;

import lombok.*;

import javax.security.auth.Subject;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestScheduleStudentDto {

    private int id;
    private int classId;
    private int studentId;
    private Map<Integer, Subject> lessons;


}
