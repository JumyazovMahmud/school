package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentScheduleDto;
import com.company.school.dto.response.ResponseStudentScheduleDto;
import com.company.school.service.StudentScheduleService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequestMapping(value = "studentSchedule")
@RequiredArgsConstructor
public class StudentScheduleController implements SimpleRequestCrud<Integer , RequestStudentScheduleDto , ResponseStudentScheduleDto> {
    private final StudentScheduleService studentScheduleService;


    @Override
    public ResponseEntity<ResponseDto<ResponseStudentScheduleDto>> createEntity(@RequestBody RequestStudentScheduleDto entity) {
        return convertStatusCodeByData(this.studentScheduleService.create(entity));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseStudentScheduleDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.studentScheduleService.get(entityId));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseStudentScheduleDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                                @RequestBody RequestStudentScheduleDto entity) {
        return convertStatusCodeByData(this.studentScheduleService.update( entityId, entity));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseStudentScheduleDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.studentScheduleService.delete(entityId));
    }
}
