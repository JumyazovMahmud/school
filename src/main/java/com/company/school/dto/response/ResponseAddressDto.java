package com.company.school.dto.response;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseAddressDto {
    private Integer addressId;
    private String addressNumber;

    private String zipCode;

    private String street;

    private String district;

    private String city;


    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
