package com.company.school.repository;

import com.company.school.entity.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministrationRepository extends JpaRepository<Administration, Integer> {
    Optional<Administration> findByAdministrationIdAndDeletedAtIsNull(Integer administrationId);
}