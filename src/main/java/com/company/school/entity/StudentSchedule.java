package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schedule_student")
public class StudentSchedule {

    @Id
    @Column(name = "schedule_student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer scheduleStudentId;

//    @ElementCollection
//    @CollectionTable(name = "schedule_lessons", joinColumns = @JoinColumn(name = "schedule_id"))
//
//    private Map<Integer, String> lessons;

    @OneToMany
    private List<Schedule> scheduleList;

    private Integer classId;

    private Integer studentId;


    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;


}
