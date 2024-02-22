package com.company.school.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestSchoolDto {

    @NotBlank(message = "NameOfBuilding cannot be null or empty!")
    private String nameOfBuilding;

    @NotNull(message = "NumberOfSchool cannot be null or empty!")
    private Integer numberOfSchool;

    @NotBlank(message = "AdditionalInformation cannot be null or empty!")
    private String additionalInformation;

    @NotNull(message = "Available cannot be null or empty!")
    private Boolean available;


    @NotNull(message = "ImageId cannot be null or empty!")
    private Integer imageId;

    @NotNull(message = "CustomerId cannot be null or empty!")
    private Integer customerId;

    @NotNull(message = "AddressId cannot be null or empty!")
    private Integer addressId;

    @NotNull(message = "TeacherId cannot be null or empty!")
    private Integer teacherId;
}
