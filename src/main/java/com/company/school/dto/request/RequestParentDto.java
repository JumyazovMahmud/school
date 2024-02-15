package com.company.school.dto.request;

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
    @NotNull(message = "Parent id cannot be null or empty!")
    private Integer parentId;
    @NotNull(message = "Parent Firstname  cannot be null or empty!")
    private String firstname;
    @NotNull(message = "Parent Lastname  cannot be null or empty!")
    private String lastname;
    private Integer studentId;
    private Integer teacherId;
    private boolean active;

}
