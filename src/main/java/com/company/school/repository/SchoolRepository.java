package com.company.school.repository;

import com.company.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SchoolRepository extends JpaRepository<School , Integer> {

    Optional<School> findBySchoolIdAndDeletedAtIsNull(Integer schoolId);

}
