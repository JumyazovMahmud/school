package com.company.school.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RequestRoomDto {

    @Min(value = 1 , message = "Room number cannot be lower than 0")
    private int roomNumber;

    @NotBlank(message = "Room name cannot be null or empty")
    private String roomName;

    @NotBlank(message = "Floor cannot be null or empty")
    private String floor;

    private boolean active;

    @NotNull(message = "Time cannot be null")
    private LocalDateTime time;

    @NotBlank(message = "Subject cannot be null or empty")
    private String subject;

}
