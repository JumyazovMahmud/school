package com.company.school.repository;

import com.company.school.entity.Parent;
import com.company.school.entity.Rooms;
import com.sun.jdi.IntegerValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms,Integer> {
    Optional<Rooms> findByRoomsIdAndDeletedAtIsNull(Integer roomsId);
}
