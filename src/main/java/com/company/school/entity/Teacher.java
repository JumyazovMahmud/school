package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

import com.company.school.entity.Parent;


@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "parent_id")
    private Integer parentId;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id", insertable = false, updatable = false)
    private Address address;

    @OneToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
    private Attendance attendance;

    @OneToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
    private Subject subject;

    @OneToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
    private TeacherSchedule teacherSchedule;




    private String phoneNumber;
    private Boolean active;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<TeacherRole> roles;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;


}
