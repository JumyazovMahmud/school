package com.company.school.repository;

import com.company.school.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher , Integer> {

    Optional<Teacher> findByIdAndDeletedAtIsNull(Integer id);
}
