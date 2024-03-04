package com.company.school.service.mapper;

import com.company.school.dto.request.RequestRoomsDto;
import com.company.school.dto.response.ResponseRoomsDto;
import com.company.school.entity.Rooms;
import lombok.RequiredArgsConstructor;
import org.mapstruct.*;

import java.util.stream.Collectors;


@Mapper(componentModel = "spring" , imports = Collectors.class)
@RequiredArgsConstructor
public abstract class RoomsMapper {


    @Mapping(target = "roomsId" , ignore = true)
    public abstract Rooms toEntity(RequestRoomsDto dto);

    public abstract ResponseRoomsDto toDto(Rooms rooms);

    @Mapping(target = "roomsId" , ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE , resultType = Rooms.class)
    public abstract Rooms updateRoom(@MappingTarget Rooms rooms , RequestRoomsDto dto);
}
