package com.company.school.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
public class RequestRoomsDto {
    @NotNull(message = "Rooms Id cannot be null or empty!")
    private Integer roomsId;
    @NotNull(message = "Rooms Number cannot be null or empty!")
    private Integer roomsNumber;
    @NotBlank(message = "Rooms Number cannot be null or empty!")
    private String roomsName;
    @NotNull(message = "Floor cannot be null or empty!")
    private Integer floor;
    @NotNull(message = "Active cannot be null or empty!")
    private boolean active;
    //    private  time;
//    private subject
}
