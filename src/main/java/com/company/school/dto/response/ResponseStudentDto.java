package com.company.school.dto.response;

import com.company.school.entity.Address;
import com.company.school.entity.Student;
import com.company.school.entity.enums.Gender;
import com.company.school.entity.enums.Status;
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
    private Address address;
    private int age;
    private LocalDate birthDate;

    private Integer subjectId;
    private Integer teacherId;
    private Integer classId;
    private Integer marksId;
    private boolean attended;

    private Status status;
    private Gender gender;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
