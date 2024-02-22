package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestRoomsDto;
import com.company.school.dto.response.ResponseRoomsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface RoomsService {


    ResponseDto<RequestRoomsDto> createEntity(Integer entity);

    ResponseDto<RequestRoomsDto> getEntity(ResponseRoomsDto entityId);

    ResponseDto<RequestRoomsDto> updateEntity(ResponseRoomsDto entityId, Integer entity);

    ResponseDto<RequestRoomsDto> deleteEntity(ResponseRoomsDto entityId);
}
