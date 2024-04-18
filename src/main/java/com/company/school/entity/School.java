package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "school")
public class School extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id", unique = true)
    private Integer schoolId;

    private String nameOfBuilding;
    private Integer numberOfSchool;
    private String additionalInformation;
    private boolean available;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @OneToMany(mappedBy = "teacherId",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Teacher> teachers;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;
//
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "school_id", referencedColumnName = "school_id", insertable = false, updatable = false)
//    private List<Administration> administrations;


}
