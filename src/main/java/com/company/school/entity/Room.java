package com.company.school.entity;

import com.company.school.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room")
public class Room extends AbsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    private int roomNumber;
    private String roomName;
    private String floor;
    private boolean active;
    private LocalDateTime time;
    private String subject;


    @ManyToOne
    @JoinColumn(name = "class_id", insertable = false, updatable = false)
    private Clazz clazz;


}
