package com.company.school.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestStudentDto {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private String parentsPhoneNumber;
    private String address;
    private int age;
    private String gender;
    private LocalDate birthDate;

    private Integer subjectId;
    private Integer teacherId;
    private Integer classId;
    private Integer marksId;
    private boolean attended;
}
