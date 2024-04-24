package com.company.school.controller;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import com.company.school.service.ParentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.company.school.dto.SimpleResponseDto.convertStatusCodeByData;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "parent")
public class ParentController {

    private final ParentService parentService;

    @PostMapping
    public ResponseEntity<ResponseDto<ResponseParentDto>> createParent(@RequestBody RequestParentDto dto) {
        return convertStatusCodeByData(this.parentService.createParent(dto));
    }

    @GetMapping
    public ResponseEntity<ResponseDto<ResponseParentDto>> getParent(@RequestParam(value = "id") Integer parentId) {
        return convertStatusCodeByData(this.parentService.getParent(parentId));
    }

    @PutMapping
    public ResponseEntity<ResponseDto<ResponseParentDto>> updateParent(@RequestParam(value = "id") Integer parentId,@RequestBody RequestParentDto dto) {
        return convertStatusCodeByData(this.parentService.updateParent(parentId, dto));
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto<ResponseParentDto>> deleteParent(@RequestParam(value = "id") Integer parentId) {
        return convertStatusCodeByData(this.parentService.deleteParent(parentId));
    }
}
