package com.company.school.dto.request;


import com.company.school.entity.TeacherRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestTeacherDto {


    @NotNull(message = "Id cannot be null or empty")
    private Integer id;

    @NotBlank(message = "Firstname cannot be null or empty")
    private String firstname;

    @NotBlank(message = "Firstname cannot be null or empty")
    private String lastname;

    @NotBlank(message = "Email cannot be null or empty")
    private String email;

    @NotBlank(message = "Password cannot be null or empty")
    private String password;

    private RequestAddressDto address;

    @NotBlank(message = "Phone number cannot be null or empty")
    private String phoneNumber;
    private Boolean active;

    private List<TeacherRole> roles;
    private Integer schoolId;

}

