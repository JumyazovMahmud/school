package com.company.school.repository;

import com.company.school.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    Optional<Teacher> findByTeacherIdAndDeletedAtIsNull(Integer teacherId);
}