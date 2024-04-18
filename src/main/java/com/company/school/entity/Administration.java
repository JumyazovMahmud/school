package com.company.school.entity;

import com.company.school.entity.enums.AdminRole;
import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "administration")
public class Administration extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer administrationId;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private AdminRole role;

    private String phoneNumber;
    private Boolean active;

    @Column(name = "school_id")
    private Integer schoolId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id", updatable = false, insertable = false)
    private School school;

}
