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
@Table(name = "teacher_schedules")
public class TeacherSchedule extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherScheduleId;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Schedule> scheduleList;

    @Column(name = "class_id")
    private Integer classId;

    @Column(name = "teacher_id")
    private Integer teacherId;


}
