package com.company.school.util;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestStudentDto;

public interface SimpleCrud <T, K>{

     ResponseDto<T> create(K entity);

     ResponseDto<T> get(Integer id);

     ResponseDto<T> update(K entity, Integer id);

     ResponseDto<T> delete(Integer id);
}
