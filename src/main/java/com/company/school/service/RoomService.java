package com.company.school.service;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomDto;
import com.company.school.dto.response.ResponseRoomDto;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {

    ResponseDto<ResponseRoomDto> createRoom(RequestRoomDto dto);

    ResponseDto<ResponseRoomDto> getRoom(Integer roomId);

    ResponseDto<ResponseRoomDto> updateRoom(Integer roomId, RequestRoomDto dto);

    ResponseDto<ResponseRoomDto> deleteRoom(Integer roomId);

}
