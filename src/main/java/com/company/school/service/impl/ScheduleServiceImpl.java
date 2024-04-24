package com.company.school.service.impl;


import com.company.school.dto.ResponseDto;
import com.company.school.dto.request.RequestScheduleDto;
import com.company.school.dto.response.ResponseScheduleDto;
import com.company.school.service.ScheduleService;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceImpl implements ScheduleService {


    @Override
    public ResponseDto<ResponseScheduleDto> createSchedule(RequestScheduleDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseScheduleDto> getSchedule(Integer scheduleId) {
        return null;
    }

    @Override
    public ResponseDto<ResponseScheduleDto> updateSchedule(Integer scheduleId, RequestScheduleDto dto) {
        return null;
    }

    @Override
    public ResponseDto<ResponseScheduleDto> deleteSchedule(Integer scheduleId) {
        return null;
    }
}
