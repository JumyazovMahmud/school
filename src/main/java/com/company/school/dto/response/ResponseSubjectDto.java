package com.company.school.dto.response;

import com.company.school.entity.enums.Mark;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseSubjectDto {

    private Integer subjectId;
    private String subjectName;
    private Integer teacherId;
    private String floor;
    private boolean active;
    private Mark mark;
    private ResponseAttendanceDto attendance;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
