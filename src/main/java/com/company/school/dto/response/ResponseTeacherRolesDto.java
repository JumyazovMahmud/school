package com.company.school.dto.response;

import com.company.school.entity.enums.TeacherRoles;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseTeacherRolesDto {

    private Integer id;
    private TeacherRoles roles;

}
