package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestClazzDto;
import com.company.school.dto.response.ResponseClazzDto;
import org.springframework.stereotype.Service;

@Service
public interface ClazzService {

    ResponseDto<ResponseClazzDto> createClazz(RequestClazzDto dto);

    ResponseDto<ResponseClazzDto> getClazz(Integer parentId);

    ResponseDto<ResponseClazzDto> updateClazz(Integer parentId, RequestClazzDto dto);

    ResponseDto<ResponseClazzDto> deleteClazz(Integer parentId);
}
