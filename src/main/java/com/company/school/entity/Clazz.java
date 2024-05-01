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
@Table(name = "clazz")
public class Clazz extends AbsEntity {

    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clazzId;
    private Integer teacherId;
    private Integer studentId;
    private Integer roomId;
    private Boolean status;

    @Column(name = "schedule_id")
    private Integer scheduleId;

    @OneToMany(mappedBy = "studentId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Student> students;

    @OneToMany(mappedBy = "roomId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Room> rooms;

    @ManyToOne
    @JoinColumn(name = "schedule_id", insertable = false, updatable = false)
    private Schedule schedule;

//    @OneToOne(mappedBy = "clazz", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private TeacherSchedule teacherSchedule;
//
//    @OneToOne(mappedBy = "clazz", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private StudentSchedule studentScheduleId;


}
