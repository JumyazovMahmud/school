package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomDto;
import com.company.school.dto.response.ResponseRoomDto;
import com.company.school.service.RoomService;
import org.springframework.stereotype.Component;

@Component
public class RoomServiceImpl implements RoomService {
    
    @Override
    public ResponseDto<ResponseRoomDto> createRoom(RequestRoomDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseRoomDto> getRoom(Integer roomId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseRoomDto> updateRoom(Integer roomId, RequestRoomDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseRoomDto> deleteRoom(Integer roomId) {
        return null;
    }
}
