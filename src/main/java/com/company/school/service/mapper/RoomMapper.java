package com.company.school.service.mapper;


import com.company.school.dto.request.RequestRoomDto;
import com.company.school.dto.response.ResponseRoomDto;
import com.company.school.entity.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper {

    public Room toEntity(RequestRoomDto dto){
        return Room.builder()
                .active(dto.isActive())
                .time(dto.getTime())
                .floor(dto.getFloor())
                .roomName(dto.getRoomName())
                .roomNumber(dto.getRoomNumber())
                .subject(dto.getSubject())
                .build();
    }

    public ResponseRoomDto toDto(Room room){
        return ResponseRoomDto.builder()
                .roomsId(room.getRoomId())
                .active(room.isActive())
                .roomName(room.getRoomName())
                .roomNumber(room.getRoomNumber())
                .floor(room.getFloor())
                .subject(room.getSubject())
                .createdAt(room.getCreatedAt())
                .updatedAt(room.getUpdatedAt())
                .deletedAt(room.getDeletedAt())
                .time(room.getTime())
                .build();
    }

    public Room update(ResponseRoomDto dto, Room room){
        if (dto.getRoomName() != null){
            room.setRoomName(dto.getRoomName());
        }
        if (dto.getRoomNumber() != null){
            room.setRoomNumber(dto.getRoomNumber());
        }
        if (dto.getFloor() != null){
            room.setFloor(dto.getFloor());
        }
        if (dto.getTime() != null){
            room.setTime(dto.getTime());
        }
        return room;
    }

}
