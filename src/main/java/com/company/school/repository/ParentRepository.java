package com.company.school.repository;

import com.company.school.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {
    Optional<Parent> findByParentIdAndDeletedAtIsNull(Integer parentId);
}
