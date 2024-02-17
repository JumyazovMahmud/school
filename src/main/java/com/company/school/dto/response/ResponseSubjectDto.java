package com.company.school.dto.response;

import jakarta.persistence.Basic;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseSubjectDto {

    private Integer subjectId;


    private String subjectName;


    private Integer teacherId;


    private String floor;


    private boolean active;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;


    private LocalDateTime deletedAt;
}
