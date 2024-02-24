package com.company.school.repository;

import com.company.school.entity.Marks;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarksRepository {
    Optional<Marks> findByAddressIdAndDeletedAtIsNull(Integer marksId);
}
