package com.company.school.service.impl;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import com.company.school.service.ParentService;
import org.springframework.stereotype.Component;

@Component
public class ParentServiceImpl implements ParentService {

    @Override
    public ResponseDto<ResponseParentDto> createParent(RequestParentDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseParentDto> getParent(Integer parentId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseParentDto> updateParent(Integer parentId, RequestParentDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseParentDto> deleteParent(Integer parentId) {
        return null;
    }
}
