package com.company.school.dto.response;

import com.company.school.dto.request.RequestTeacherRoleDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTeacherDto {


    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    private ResponseAddressDto address;

    private String phoneNumber;
    private Boolean active;

    private List<RequestTeacherRoleDto> roles;

    private Integer schoolId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
