package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor
@Table(name = "teacher_schedule")
@Builder
public class TeacherSchedule {
    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherScheduleId;


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "order_item_mapping",
//            joinColumns = {@JoinColumn(name = "order_id", referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "item_id", referencedColumnName = "id")})
//    @MapKey(name = "itemName")

//    @Transient
//    private Map<Integer , Subject> lessons;

    @OneToMany
    private List<Schedule> scheduleList;

    @Column(name = "class_id")
    private Integer classId;
    @Column(name = "teacher_id")

    private Integer teacherId;



    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


    private LocalDateTime deletedAt;

}
