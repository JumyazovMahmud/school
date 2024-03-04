package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;
    private Integer hours;
    private String subjectName;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "teacher_id" , unique = true)
    private Integer teacherId;

    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
    private Subject subject;

}
