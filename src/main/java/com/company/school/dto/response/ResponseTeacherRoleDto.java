package com.company.school.dto.response;

import com.company.school.entity.enums.TeacherRoles;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// Will decide if it is needed or not
public class ResponseTeacherRoleDto {

    private Integer id;

    @Enumerated(EnumType.STRING)
    private TeacherRoles roles;

}