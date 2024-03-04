package com.company.school.dto.response;

import com.company.school.entity.Student;
import com.company.school.entity.Teacher;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseParentDto {

    private Integer parentId;
    private String firstname;
    private String lastname;

    private Integer studentId;
    private Integer teacherId;
    private boolean active;
    private List<ResponseStudentDto> students;

    private ResponseTeacherDto teacher;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
