package com.company.school.entity.template;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class, EntityListeners.class})
public class AbsEntity {

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Time createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;


}
