package com.company.school.dto.request;

import com.company.school.entity.enums.AdminRole;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestAdministrationDto {

    @NotBlank(message = "Firstname cannot be null or empty")
    private String firstname;

    @NotBlank(message = "Lastname cannot be null or empty")
    private String lastname;

    @NotBlank(message = "Email cannot be null or empty")
    private String email;

    @NotBlank(message = "Password cannot be null or empty")
    private String password;

    private AdminRole role;

    @NotBlank(message = "Phone number cannot be null or empty")
    private String phoneNumber;

    private Boolean active;
    private Integer schoolId;

}
