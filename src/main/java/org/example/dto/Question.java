package org.example.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private Integer id;
    private Integer examId;
    private String text;
    private String option;
    private String correctAnswer;
    private Integer points;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

}
