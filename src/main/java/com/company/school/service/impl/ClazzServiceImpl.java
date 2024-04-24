package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestClazzDto;
import com.company.school.dto.response.ResponseClazzDto;
import com.company.school.service.ClazzService;
import org.springframework.stereotype.Component;

@Component
public class ClazzServiceImpl implements ClazzService {

    @Override
    public ResponseDto<ResponseClazzDto> createClazz(RequestClazzDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseClazzDto> getClazz(Integer parentId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseClazzDto> updateClazz(Integer parentId, RequestClazzDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseClazzDto> deleteClazz(Integer parentId) {
        return null;
    }
}
