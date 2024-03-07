package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
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
