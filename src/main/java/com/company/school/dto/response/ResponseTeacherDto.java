package com.company.school.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTeacherDto {


    private Integer teacherId;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    private String phoneNumber;
    private Boolean active;

    private ResponseAddressDto address;
    private ResponseSubjectDto subject;
    private ResponseTeacherScheduleDto teacherSchedule;
    private ResponseSchoolDto school;


    private Integer schoolId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
