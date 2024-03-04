package com.company.school.dto.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

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


    private ResponseTeacherDto teachers;

    private ResponseAddressDto address;

    private List<ResponseAdministrationDto> administrations;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
