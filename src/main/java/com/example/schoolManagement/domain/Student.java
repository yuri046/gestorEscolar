package com.example.schoolManagement.domain;

import com.example.schoolManagement.domain.enums.ApprovalStatus;
import com.example.schoolManagement.domain.enums.StudentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private boolean specialNecessity;
    @Enumerated(EnumType.STRING)
    private StudentStatus status;
    private ApprovalStatus approvalStatus;
    private Double score;
    private Double behavioralScore;
}
