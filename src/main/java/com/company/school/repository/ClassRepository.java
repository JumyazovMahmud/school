package com.company.school.repository;

import com.company.school.entity.Clazz;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ClassRepository {

    Optional<Clazz>findByAddressIdAndDeletedAtIsNull(Integer classId);
}
