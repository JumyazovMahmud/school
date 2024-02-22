package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomsDto;
import com.company.school.dto.response.ResponseRoomsDto;
import com.company.school.util.SCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "rooms")
public class RoomsController implements SCrud<ResponseRoomsDto,Integer, RequestRoomsDto> {
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> create(RequestRoomsDto request) {
        return null;
    }

    @Override
    @GetMapping
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> get(Integer entityId) {
        return null;
    }

    @Override
    @PutMapping
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> update(Integer entityId, RequestRoomsDto request) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseRoomsDto>> delete(Integer entityId) {
        return null;
    }
}
