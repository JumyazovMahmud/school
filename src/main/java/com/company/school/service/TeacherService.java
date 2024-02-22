package com.company.school.service;

import com.company.school.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService<T , K , L> {
    ResponseDto<T> create(L request);

    ResponseDto<T> get(K entityId);

    ResponseDto<T> update(K entityId , L request);

    ResponseDto<T> delete(K entityId);
}
