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
@Table(name = "teacher_schedule")
public class TeacherSchedule extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_schedule_id")
    private Integer teacherScheduleId;

//    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
//    private List<Schedule> scheduleList;

    @Column(name = "class_id")
    private Integer classId;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id", insertable = false, updatable = false)
    private Clazz clazz;

    @OneToMany(mappedBy = "scheduleId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Schedule> schedule;


}
