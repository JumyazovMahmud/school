package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schedulestudent")
public class ScheduleStudent {

    @Id
    @Column(name = "schedule_student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @ElementCollection
    @CollectionTable(name = "schedule_lessons", joinColumns = @JoinColumn(name = "schedule_id"))

    private Map<Integer, String> lessons;

    private Integer classId;

    private Integer studentId;


    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;


}
