package com.company.school.entity;

import com.company.school.entity.enums.Gender;
import com.company.school.entity.enums.Status;
import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
public class Student extends AbsEntity {

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
    private int age;
    private LocalDate birthDate;

    @Column(name = "subject_id")
    private Integer subjectId;
    private Integer teacherId;

    @Column(name = "marks_id")
    private Integer marksId;

    @Column(name = "class_id")
    private Integer classId;

    private boolean attended;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Gender gender;

//    @Enumerated(EnumType.STRING)
//    private org.example.schooltestproject.entity.enums.Mark mark;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "class_id", updatable = false, insertable = false)
    private Clazz clazz;

    @OneToMany(mappedBy = "studentId", cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Subject> subject;

//    @OneToMany(mappedBy = "studentId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Mark> marks;

    @OneToMany(mappedBy = "studentId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Schedule> schedule;

    

}
