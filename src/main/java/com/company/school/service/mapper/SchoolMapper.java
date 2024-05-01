package com.company.school.service.mapper;

import com.company.school.dto.request.RequestSchoolDto;
import com.company.school.dto.response.ResponseSchoolDto;
import com.company.school.entity.School;
import org.springframework.stereotype.Component;

@Component
public class SchoolMapper {

    public School toEntity(RequestSchoolDto dto){
        return School.builder()
                .additionalInformation(dto.getAdditionalInformation())
                .numberOfSchool(dto.getNumberOfSchool())
                .available(dto.getAvailable())
                .nameOfBuilding(dto.getNameOfBuilding())
                .build();
    }

    public ResponseSchoolDto toDto(School school) {
        return ResponseSchoolDto.builder()
                .schoolId(school.getSchoolId())
                .additionalInformation(school.getAdditionalInformation())
                .available(school.isAvailable())
                .numberOfSchool(school.getNumberOfSchool())
                .addressId(school.getAddressId())
                .nameOfBuilding(school.getNameOfBuilding())
//                .address(school.getAddress())
                .teacherId(school.getTeacherId())
//                .teachers(school.getTeachers())
//                .administrations()
                .createdAt(school.getCreatedAt())
                .updatedAt(school.getUpdatedAt())
                .deletedAt(school.getDeletedAt())
                .build();
    }

    public School update(RequestSchoolDto dto, School school){
        return null;
    }
}
