package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestScheduleDto;
import com.company.school.dto.response.ResponseScheduleDto;
import com.company.school.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseScheduleDto>> createSchedule(@RequestBody RequestScheduleDto dto){
        return convertStatusCodeByData(this.scheduleService.createSchedule(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseScheduleDto>> getSchedule(@RequestParam(value = "id") Integer scheduleId){
        return convertStatusCodeByData(this.scheduleService.getSchedule(scheduleId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseScheduleDto>> updateSchedule(@RequestParam(value = "id") Integer scheduleId, @RequestBody RequestScheduleDto dto){
        return convertStatusCodeByData(this.scheduleService.updateSchedule(scheduleId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseScheduleDto>> deleteSchedule(@RequestParam(value = "id") Integer scheduleId){
        return convertStatusCodeByData(this.scheduleService.deleteSchedule(scheduleId));
    }


}
