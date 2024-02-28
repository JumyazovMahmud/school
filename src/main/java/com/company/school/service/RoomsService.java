package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomsDto;
import com.company.school.dto.response.ResponseRoomsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface RoomsService {


    ResponseDto<ResponseRoomsDto> createEntity(RequestRoomsDto dto);

    ResponseDto<ResponseRoomsDto> getEntity(Integer entityId);

    ResponseDto<ResponseRoomsDto> updateEntity(Integer entityId, RequestRoomsDto dto);

    ResponseDto<ResponseRoomsDto> deleteEntity(Integer entityId);
}
