package com.company.school.util;

import com.company.school.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

public interface SCrud<T , K , L> {

    // Response - T
    // Integer - K
    // Request - L

    ResponseEntity<ResponseDto<T>> create(L request);

    ResponseEntity<ResponseDto<T>> get(K entityId);

    ResponseEntity<ResponseDto<T>> update(K entityId , L request);

    ResponseEntity<ResponseDto<T>> delete(K entityId);
}
