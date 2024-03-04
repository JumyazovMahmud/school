package com.company.school.repository;


import com.company.school.entity.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministrationRespository extends JpaRepository<Administration, Integer> {

    Optional<Administration> findAdministrationByAdministrationIdAndDeletedAtIsNull(Integer adminId);

    Optional<Administration> findAdministrationByAdministrationIdAndActiveIsTrue(Integer adminId);

}
