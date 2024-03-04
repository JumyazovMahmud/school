package com.company.school.dto.request;

import com.company.school.entity.enums.TeacherRoles;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RequestTeacherRolesDto {

    @NotNull(message = "Roles cannot be null")
    private TeacherRoles roles;
}
