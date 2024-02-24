package com.company.school.repository;

import com.company.school.entity.Attendance;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttendanceRepository {
    Optional<Attendance> findByAddressIdAndDeletedAtIsNull(Integer attendanceId);
}
