package com.company.school.repository;

import com.company.school.entity.Administration;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Repository;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Optional;

@Repository
public interface AdministrationRepository {
    Optional<Administration> findByAddressIdAndDeletedAtIsNull(Integer administrationId);
}
