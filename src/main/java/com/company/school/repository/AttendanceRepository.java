
package com.company.school.repository;

import com.company.school.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    Optional<Attendance> findByAttendanceIdAndDeletedAtIsNull(Integer attendanceId);
}