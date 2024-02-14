package com.company.school.dto.response;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ResponseTeacherScheduleDto {

    private Integer teacherScheduleId;

    private Integer classId;

    private Integer teacherId;

    private List<ResponseScheduleDto> scheduleList;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


    private LocalDateTime deletedAt;
}
