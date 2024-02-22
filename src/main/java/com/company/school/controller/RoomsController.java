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
public class RoomsController implements SimpleRequestCrud<Integer, RequestRoomsDto, ResponseRoomsDto> {

    private final RoomsService roomsService;


    @PostMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> createEntity(@RequestBody RequestRoomsDto dto) {
        return convertStatusCodeByData(this.roomsService.createEntity(dto));
    }

    @GetMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.roomsService.getEntity(entityId));
    }

    @PutMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> updateEntity(@RequestParam(value = "id") Integer entityId, @RequestBody RequestRoomsDto dto) {
        return convertStatusCodeByData(this.roomsService.updateEntity(entityId, dto));
    }

    @DeleteMapping
    @Override
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> deleteEntity(@RequestBody Integer entityId) {
        return convertStatusCodeByData(this.roomsService.deleteEntity(entityId));
    }
}
