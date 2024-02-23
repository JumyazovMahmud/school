package com.company.school.controller;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestTeacherDto;
import com.company.school.dto.response.ResponseTeacherDto;
import com.company.school.service.TeacherService;
import com.company.school.util.SimpleRequestCrud;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequestMapping(value = "teachers")
@RequiredArgsConstructor
public class TeacherController implements SimpleRequestCrud<Integer , RequestTeacherDto , ResponseTeacherDto> {
    private final TeacherService teacherService;
    @Override
    @PostMapping
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> createEntity(@RequestBody RequestTeacherDto entity) {
        return convertStatusCodeByData(this.teacherService.create(entity));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> getEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.teacherService.get(entityId));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> updateEntity(@RequestParam(value = "id") Integer entityId,
                                                                        @RequestBody RequestTeacherDto entity) {
        return convertStatusCodeByData(this.teacherService.update(entityId, entity));
    }

    @Override
    public ResponseEntity<ResponseDto<ResponseTeacherDto>> deleteEntity(@RequestParam(value = "id") Integer entityId) {
        return convertStatusCodeByData(this.teacherService.delete(entityId));
    }

}
