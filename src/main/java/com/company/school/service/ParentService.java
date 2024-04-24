package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import org.springframework.stereotype.Service;

@Service
public interface ParentService {

    ResponseDto<ResponseParentDto> createParent(RequestParentDto dto);

    ResponseDto<ResponseParentDto> getParent(Integer parentId);

    ResponseDto<ResponseParentDto> updateParent(Integer parentId, RequestParentDto dto);

    ResponseDto<ResponseParentDto> deleteParent(Integer parentId);

}

