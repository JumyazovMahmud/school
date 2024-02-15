package com.company.school.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Struct;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestAddressDto {
    @NotNull(message = "Roms Id cannot be null or empty!")
    private Integer romsId;
    @NotBlank(message = "Address Number cannot be null or empty!")
    private String addressNumber;
    @NotBlank(message = "ZimCode cannot be null or empty!")
    private String zimCode;
    @NotBlank(message = "Street cannot be null or empty!")
    private String street;
    @NotBlank(message = "District cannot be null or empty!")
    private String district;
    @NotBlank(message = "City cannot be null or empty!")
    private String city;


}
