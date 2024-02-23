package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.request.RequestTeacherScheduleDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.dto.response.ResponseTeacherScheduleDto;
import com.company.school.service.TeacherScheduleService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequestMapping(value = "teacherSchedule")
@RequiredArgsConstructor
public class TeacherScheduleController implements SimpleRequestCrud<Integer , RequestTeacherScheduleDto, ResponseTeacherScheduleDto> {
    private final TeacherScheduleService teacherScheduleService;


    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherScheduleDto>> createEntity(@RequestBody RequestTeacherScheduleDto entity) {
        return convertStatusCodeByData(teacherScheduleService.create(entity));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherScheduleDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
         return convertStatusCodeByData(this.teacherScheduleService.get(entityId));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherScheduleDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                                @RequestBody RequestTeacherScheduleDto entity) {
         return convertStatusCodeByData(this.teacherScheduleService.update(entityId , entity));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherScheduleDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.teacherScheduleService.delete(entityId));
    }
}
