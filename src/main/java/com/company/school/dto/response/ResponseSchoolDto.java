package com.company.school.dto.response;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseSchoolDto {

    private Integer schoolId;
    private String nameOfBuilding;
    private Integer numberOfSchool;
    private String additionalInformation;
    private boolean available;
    private Integer imageId;
    private Integer customerId;
    private Integer addressId;
    private Integer teacherId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
