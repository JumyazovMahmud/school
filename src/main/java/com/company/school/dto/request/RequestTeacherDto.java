package com.company.school.dto.request;


import com.company.school.entity.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestTeacherDto {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    private Integer addressId;

    private Integer parentId;

    private Address address;

    private Attendance attendance;

    private Subject subject;



    private String phoneNumber;
    private Boolean active;

}
