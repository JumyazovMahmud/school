package com.company.school.repository;

import com.company.school.entity.TeacherSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherScheduleRepository extends JpaRepository<TeacherSchedule,Integer> {
    Optional<TeacherSchedule> findByTeacherScheduleIdAndDeletedAtIsNull(Integer id);

}