package com.company.school.repository;

import com.company.school.entity.Rooms;
import com.sun.jdi.IntegerValue;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomsRepository {
    Optional<Rooms> findByAddressIdAndDeletedAtIsNull(Integer roomsId);
}
