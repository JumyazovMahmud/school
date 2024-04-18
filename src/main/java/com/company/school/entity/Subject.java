package com.company.school.entity;

import com.company.school.entity.enums.Mark;
import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subject")
public class Subject extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Integer subjectId;
    private String subjectName;
    private String floor;
    private boolean active;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "attendance_id")
    private Integer attendanceId;

    @Enumerated(EnumType.STRING)
    private Mark mark;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "attendance_id", insertable = false, updatable = false)
    private Attendance attendance;



//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Schedule schedule;

}
