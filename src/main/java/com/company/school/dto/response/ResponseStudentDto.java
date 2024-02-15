package com.company.school.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseStudentDto {
    private Integer studentId;
    private String firstname;
    private String lastname;
    private String middleName;
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

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
