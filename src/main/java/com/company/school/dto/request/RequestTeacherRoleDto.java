package com.company.school.dto.request;

import com.company.school.entity.enums.TeacherRoles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// Will decide if it is needed or not
public class RequestTeacherRoleDto {

    private Integer id;

    @Enumerated(EnumType.STRING)
    private TeacherRoles roles;

}
