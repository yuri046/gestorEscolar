package com.example.schoolManagement.domain;

import com.example.schoolManagement.domain.enums.ExamStatus;
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
public class Exam {
    @Id
    private Long id;
    private Double maxScore;
    private Double score;
    @Enumerated(EnumType.STRING)
    private ExamStatus status;
    @OneToOne
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
    @ManyToMany
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
}
