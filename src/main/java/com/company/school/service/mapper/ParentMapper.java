package com.company.school.service.mapper;


import com.company.school.dto.request.RequestParentDto;
import com.company.school.dto.response.ResponseParentDto;
import com.company.school.entity.Parent;
import org.springframework.stereotype.Component;

@Component
public class ParentMapper {

    public Parent toEntity(RequestParentDto dto){
        return Parent.builder()
                .active(dto.isActive())
                .firstname(dto.getFirstname())
                .lastname(dto.getLastname())
                .build();
    }

    public ResponseParentDto toDto(Parent parent){
        return ResponseParentDto.builder()
                .active(parent.isActive())
                .parentId(parent.getParentId())
                .studentId(parent.getStudentId())
                .firstname(parent.getFirstname())
                .lastname(parent.getLastname())
                .createdAt(parent.getCreatedAt())
                .updatedAt(parent.getUpdatedAt())
                .deletedAt(parent.getDeletedAt())
//                .students(parent.getStudents())
                .build();
    }

    public Parent update(RequestParentDto dto, Parent parent){
        if (dto.getFirstname() != null){
            parent.setFirstname(dto.getFirstname());
        }
        if (dto.getLastname() != null){
            parent.setLastname(dto.getLastname());
        }
        return parent;
    }
}
