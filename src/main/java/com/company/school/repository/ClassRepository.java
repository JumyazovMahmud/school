package com.company.school.repository;

import com.company.school.entity.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<Clazz, Integer> {

    Optional<Clazz> findByClassIdAndDeletedAtIsNull(Integer classId);
}
