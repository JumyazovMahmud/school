package com.company.school.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import com.company.school.entity.Parent;


@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "parent_id")
    private Integer parentId;

    @OneToOne
    @JoinColumn(name = "address_id" , referencedColumnName = "address_id" , insertable = false , updatable = false)
    private Address address;

//    @ManyToOne( fetch = FetchType.EAGER , cascade = CascadeType.ALL)
////    @JoinColumn(name = "parent_id" , referencedColumnName = "parent_id" , insertable = false , updatable = false)
//    private List<Parent> parents;

    private String phoneNumber;
    private Boolean active;

    @OneToMany(mappedBy = "id")
    private List<TeacherRole> roles;



    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;


}
