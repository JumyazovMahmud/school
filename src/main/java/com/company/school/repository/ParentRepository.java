package com.company.school.repository;

import com.company.school.entity.Parent;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParentRepository {
    Optional<Parent> findByAddressIdAndDeletedAtIsNull(Integer parentId);
}
