package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teacher")
public class Teacher extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Integer teacherId;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private Boolean active;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "teacher_schedule_id")
    private Integer teacherScheduleId;

    @Column(name = "school_id")
    private Integer schoolId;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", insertable = false, updatable = false)
    private Subject subject;

    @OneToMany
    @JoinColumn(name = "teacher_schedule_id", insertable = false, updatable = false)
    private List<TeacherSchedule> teacherSchedule;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_id", insertable = false, updatable = false)
    private School school;


//    @OneToOne
//    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
//    private Attendance attendance;
//

//
//    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
//    private List<TeacherRole> roles;


}
