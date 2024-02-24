package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestAttendanceDto;
import com.company.school.dto.response.ResponseAttendanceDto;
import com.company.school.service.AttendanceService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "attendance")
public class AttendanceController implements SimpleRequestCrud<Integer, RequestAttendanceDto, ResponseAttendanceDto> {

    private final AttendanceService attendanceService;
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseAttendanceDto>> createEntity(@RequestBody RequestAttendanceDto entity) {
        return convertStatusCodeByData(this.attendanceService.createEntity(entity));
    }

    @Override
    @GetMapping
    public ResponseEntity<ResponseDto<ResponseAttendanceDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.attendanceService.getEntity(entityId));
    }

    @Override
    @PutMapping
    public ResponseEntity<ResponseDto<ResponseAttendanceDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                           @RequestBody RequestAttendanceDto entity) {
        return convertStatusCodeByData(this.attendanceService.updateEntity(entityId, entity));
    }

    @Override
    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseAttendanceDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.attendanceService.deleteEntity(entityId));
    }
}
