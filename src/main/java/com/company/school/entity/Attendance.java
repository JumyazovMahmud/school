package com.company.school.entity;


import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendance")
public class Attendance extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attendanceId;
    private String clazz;
    private Integer absent;
    private LocalDateTime data;

    @Column(name = "teacher_id")
    private Integer teacherId;


}

