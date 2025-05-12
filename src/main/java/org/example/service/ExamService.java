package org.example.service;

import org.example.dto.Exam;

import java.util.List;

public interface ExamService {

    void createExam(Exam exam);

    Exam getExamByCourseId(Integer integer);

    List<Exam> getAll();

    void updateExam(Exam exam);

    void deleteExamById(Integer id);

    void deleteExamByCourseId(Integer integer);
}
