package com.company.school.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseRoomDto {

    private Integer roomsId;
    private Integer roomNumber;
    private String roomName;
    private String floor;
    private boolean active;
    private LocalDateTime time;
    private String subject;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
