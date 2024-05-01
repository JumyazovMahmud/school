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
@Table(name = "schedule")
public class Schedule extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Integer scheduleId;
    private Integer hours;
    private String subjectName;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "teacher_id" , unique = true)
    private Integer teacherId;


    @OneToMany(mappedBy = "clazzId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Clazz> clazzList;

//    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
//    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
//    private Subject subject;

}
