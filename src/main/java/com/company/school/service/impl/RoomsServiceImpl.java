package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomsDto;
import com.company.school.dto.response.ResponseRoomsDto;
import com.company.school.service.RoomsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RoomsServiceImpl  implements RoomsService {
    @Override
    public ResponseDto<ResponseRoomsDto> createEntity(RequestRoomsDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseRoomsDto> getEntity(Integer entityId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseRoomsDto> updateEntity(Integer entityId, RequestRoomsDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseRoomsDto> deleteEntity(Integer entityId) {
        return null;
    }
}
