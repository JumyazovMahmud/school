package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomDto;
import com.company.school.dto.response.ResponseRoomDto;
import com.company.school.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "room")
public class RoomController {

    private final RoomService roomService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseRoomDto>> createRoom(@RequestBody RequestRoomDto dto){
        return convertStatusCodeByData(this.roomService.createRoom(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseRoomDto>> getRoom(@RequestParam(value = "id") Integer roomId){
        return convertStatusCodeByData(this.roomService.getRoom(roomId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseRoomDto>> updateRoom(@RequestParam(value = "id") Integer roomId, @RequestBody RequestRoomDto dto){
        return convertStatusCodeByData(this.roomService.updateRoom(roomId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseRoomDto>> deleteRoom(@RequestParam(value = "id") Integer roomId){
        return convertStatusCodeByData(this.roomService.deleteRoom(roomId));
    }
}
