package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String middleName;
    private String email;
    private String password;
    private String phoneNumber;
    private String parentsPhoneNumber;
    private String address;
    private int age;
    private LocalDate birthDate;

    private Integer subjectId;
    private Integer teacherId;
    private Integer classId;
    private Integer marksId;
    private boolean attended;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public enum Status {
        ACTIVE,
        INACTIVE
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
}
