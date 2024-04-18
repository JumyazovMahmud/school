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
@Table(name = "parent")
public class Parent extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent_id")
    private Integer parentId;
    private String firstname;
    private String lastname;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "student_id")
    private Integer studentId;

    @OneToMany
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private List<Student> students;

    private boolean active;
//
//    @ManyToOne
//    @JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", insertable = false, updatable = false)
//    private Teacher teacher;

}
