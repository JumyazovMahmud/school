package com.company.school.service.mapper;


import com.company.school.dto.request.RequestAdministrationDto;
import com.company.school.dto.response.ResponseAdministrationDto;
import com.company.school.entity.Administration;
import org.springframework.stereotype.Component;

@Component
public class AdministrationMapper {

    public Administration toEntity(RequestAdministrationDto dto){
        return Administration.builder()
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .phoneNumber(dto.getPhoneNumber())
                .active(dto.getActive())
                .role(dto.getRole())
                .build();
    }

    public ResponseAdministrationDto toDto(Administration administration){
        return ResponseAdministrationDto.builder()
                .administrationId(administration.getAdministrationId())
                .active(administration.getActive())
                .firstname(administration.getFirstname())
                .lastname(administration.getLastname())
                .email(administration.getEmail())
                .password(administration.getPassword())
                .schoolId(administration.getSchoolId())
                .phoneNumber(administration.getPhoneNumber())
                .createdAt(administration.getCreatedAt())
                .updatedAt(administration.getUpdatedAt())
                .deletedAt(administration.getDeletedAt())
                .build();
    }

    public Administration update(RequestAdministrationDto dto, Administration administration){
        if (dto.getFirstname() != null){
            administration.setFirstname(dto.getFirstname());
        }
        if (dto.getLastname() != null){
            administration.setLastname(dto.getLastname());
        }
        if (dto.getEmail() != null){
            administration.setEmail(dto.getEmail());
        }
        if (dto.getPassword() != null){
            administration.setPassword(dto.getPassword());
        }
        if (dto.getPhoneNumber() != null){
            administration.setPhoneNumber(dto.getPhoneNumber());
        }
        return administration;
    }
}
