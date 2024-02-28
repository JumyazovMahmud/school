package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@Table(name = "Marks")
public class Marks extends AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer marksId;
    private Integer studentId;
    private  String mark;
    private String subjectName;

//    private List<String> mark; // index 0 mark = index 0 student
//
//    @OneToOne(mappedBy = "studentId" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//    private List<Student> students;


}
