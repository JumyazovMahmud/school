package com.company.school.repository;

import com.company.school.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Integer> {

    Optional<Marks> findByMarksIdAndDeletedAtIsNull(Integer marksId);
}
