package com.example.schoolManagement.domain;

import com.example.schoolManagement.domain.enums.ClassRoomStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int number;
    private int year;
    private Double minimalApprovalScore;
    private Double classScore;
    private Double classBehaviorScore;
    @Enumerated(EnumType.STRING)
    private ClassRoomStatus status;
}
