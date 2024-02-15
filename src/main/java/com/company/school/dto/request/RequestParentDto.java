package com.company.school.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestParentDto {
    @NotBlank(message = "Parent id cannot be null or empty!")
    private Integer parentId;
    @NotBlank(message = "Firstname cannot be null or empty!")
    private String firstname;
    @NotBlank(message = "Lastname cannot be null or empty!")
    private String lastname;

    @NotNull(message = "Student id cannot be null")
    private Integer studentId;

    @NotNull(message = "Teacher id cannot be null")
    private Integer teacherId;
    private boolean active;

}
