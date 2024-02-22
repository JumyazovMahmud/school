package com.company.school.dto.response;

import com.company.school.entity.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;




@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseTeacherDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Integer addressId;

    private Integer parentId;

    private Address address;

    private Attendance attendance;

    private Subject subject;
    private TeacherSchedule teacherSchedule;
    private String phoneNumber;
    private Boolean active;

    private List<TeacherRole> roles;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
