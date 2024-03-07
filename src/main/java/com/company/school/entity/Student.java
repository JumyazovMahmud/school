package com.company.school.entity;

import com.company.school.entity.enums.Gender;
import com.company.school.entity.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
    @Column(name = "student_id")
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
    private LocalDate birthDate;

    @Column(name = "subject_id")
    private Integer subjectId;
    private Integer teacherId;
    private Integer classId;

    @Column(name = "marks_id")
    private Integer marksId;

    private boolean attended;

    @OneToMany(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id", updatable = false, insertable = false)
    private List<Subject> subject;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Marks> marks;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;




}
