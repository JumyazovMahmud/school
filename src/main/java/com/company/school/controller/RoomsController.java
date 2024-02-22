package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.SimpleResponseDto;
import com.company.school.dto.request.RequestRoomsDto;
import com.company.school.dto.response.ResponseRoomsDto;
import com.company.school.service.RoomsService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "Rooms")
public class RoomsController implements SimpleRequestCrud<ResponseRoomsDto, Integer, RequestRoomsDto> {

    private final RoomsService roomsService;


    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<RequestRoomsDto>> createEntity(Integer entity) {
        return convertStatusCodeByData(this.roomsService.createEntity(entity));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<RequestRoomsDto>> getEntity(ResponseRoomsDto entityId) {
        return convertStatusCodeByData(this.roomsService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<RequestRoomsDto>> updateEntity(ResponseRoomsDto entityId, Integer entity) {
        return convertStatusCodeByData(this.roomsService.updateEntity(entityId, entity));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<RequestRoomsDto>> deleteEntity(ResponseRoomsDto entityId) {
        return convertStatusCodeByData(this.roomsService.deleteEntity(entityId));
    }
}
