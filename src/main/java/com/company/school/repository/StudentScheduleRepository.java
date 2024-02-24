package com.company.school.repository;

import com.company.school.entity.StudentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentScheduleRepository extends JpaRepository<StudentSchedule , Integer> {


    Optional<StudentSchedule> findByScheduleStudentIdAndDeletedAtIsNull(Integer scheduleStudentId);


}
