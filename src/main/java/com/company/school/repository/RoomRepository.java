package com.company.school.repository;


import com.company.school.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {
    Optional<Room> findByRoomIdAndDeletedAtIsNull(Integer roomId);
}