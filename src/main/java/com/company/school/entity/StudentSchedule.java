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
@Table(name = "student_schedule")
public class StudentSchedule extends AbsEntity {

    @Id
    @Column(name = "schedule_student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentScheduleId;

    @Column(name = "class_id")
    private Integer classId;

    @Column(name = "student_id")
    private Integer studentId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private Student student;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "class_id", insertable = false, updatable = false)
    private Clazz clazz;

    @OneToMany(mappedBy = "scheduleId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Schedule> schedule;

//    @ElementCollection
//    @CollectionTable(name = "schedule_lessons", joinColumns = @JoinColumn(name = "schedule_id"))
//
//    private Map<Integer, String> lessons;

//    @OneToMany(mappedBy = "studentId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Schedule> scheduleList;



}
