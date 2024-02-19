package com.company.school.dto.request;

import com.company.school.entity.enums.AdminRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestAdministrationDto {


    @NotNull(message = "Id cannot be null or empty")
    private Integer id;

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

    // Boolean or boolean?
    private Boolean active;


    // Will decide if it is needed or not
    private Integer schoolId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
