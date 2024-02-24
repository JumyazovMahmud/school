package com.company.school.dto.request;

import com.company.school.entity.enums.AdminRole;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestAdminstrationDto {


    private String firstname;
    private String lastname;
    private String email;
    private String password;

    private AdminRole role;

    private String phoneNumber;
    private Boolean active;

    private Integer schoolId;

}
