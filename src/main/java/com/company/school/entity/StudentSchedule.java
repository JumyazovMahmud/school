package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
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
@Table(name = "student_schedules")
public class StudentSchedule extends AbsEntity {

    @Id
    @Column(name = "schedule_student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleStudentId;

//    @ElementCollection
//    @CollectionTable(name = "schedule_lessons", joinColumns = @JoinColumn(name = "schedule_id"))
//
//    private Map<Integer, String> lessons;

    @Column(name = "schedule_id")
    private Integer scheduleId;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinColumn(name = "schedule_id", referencedColumnName = "schedule_id", updatable = false, insertable = false)
    private List<Schedule> scheduleList;

    private Integer classId;
    private Integer studentId;

}
