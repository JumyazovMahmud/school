package com.company.school.modul;

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
