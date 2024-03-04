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
@Table(name = "clazz")
public class Clazz {

    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer classId;

    private Integer teacherId;

    private Integer studentId;

    private Integer roomId;

    private Boolean status;

    @OneToOne( cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id",referencedColumnName = "class_id")
    private TeacherSchedule teacherSchedule;


    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;


}
