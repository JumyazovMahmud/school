package com.company.school.entity;

import com.company.school.entity.enums.AdminRole;
import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

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

    private AdminRole role;

    private String phoneNumber;
    private Boolean active;

    @Column(name = "school_id")
    private Integer schoolId;

}
