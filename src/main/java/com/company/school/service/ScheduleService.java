package com.company.school.service;

import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestScheduleDto;
import com.company.school.dto.response.ResponseScheduleDto;
import org.springframework.stereotype.Service;

@Service
public interface ScheduleService {

    ResponseDto<ResponseScheduleDto> createSchedule(RequestScheduleDto dto);

    ResponseDto<ResponseScheduleDto> getSchedule(Integer scheduleId);

    ResponseDto<ResponseScheduleDto> updateSchedule(Integer scheduleId, RequestScheduleDto dto);

    ResponseDto<ResponseScheduleDto> deleteSchedule(Integer scheduleId);


}
