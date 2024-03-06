package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "marks")
public class Marks extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marks_id")
    private Integer marksId;

//    @Column(name = "student_id")
//    private Integer studentId;
    private String mark;
    private String subjectName;

//    private List<String> mark; // index 0 mark = index 0 student
//
//    @OneToOne(mappedBy = "studentId" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//    private List<Student> students;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;


}
