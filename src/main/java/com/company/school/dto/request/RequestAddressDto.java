package com.company.school.dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestAddressDto {

    @NotBlank(message = "Address number cannot be null or empty")
    private String addressNumber;

    @NotBlank(message = "Zip code cannot be null or empty")
    private String zipCode;

    @NotBlank(message = "Street cannot be null or empty")
    private String street;

    @NotBlank(message = "District cannot be null or empty")
    private String district;

    @NotBlank(message = "City cannot be null or empty")
    private String city;
}
