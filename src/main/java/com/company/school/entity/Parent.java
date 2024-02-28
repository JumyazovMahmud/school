package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.sql.results.jdbc.spi.JdbcValuesSourceProcessingState;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Parent")
public class Parent extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent_id")
    private Integer parentId;
    private String firstname;
    private String lastname;

    @Column(name = "teacher_id")
    private Integer teacherId;

    private Integer studentId;

    @OneToMany
    @JoinColumn(name = "student_id" , referencedColumnName = "student_id" , insertable = false , updatable = false)
    private List<Student> students;

    private boolean active;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName="teacher_id")
    private Teacher teacher;

}
