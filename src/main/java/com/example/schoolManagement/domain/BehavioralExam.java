package com.example.schoolManagement.domain;

import com.example.schoolManagement.domain.enums.ExamStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BehavioralExam {
    @Id
    private Long id;
    private Double maxScore;
    private Double score;
    private ExamStatus status;
}
