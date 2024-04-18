//package com.company.school.entity;
//
//import com.company.school.entity.template.AbsEntity;
//import jakarta.persistence.*;
//import lombok.*;
//
//@Getter
//@Setter
//@Entity
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "mark")
//public class Mark extends AbsEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "marks_id")
//    private Integer marksId;
//
//    @Column(name = "student_id")
//    private Integer studentId;
//
//    private String mark;
//    private String subjectName;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id", insertable = false, updatable = false)
//    private Student student;
//
////    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//////    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
////    private Student student;
//
//
//}
