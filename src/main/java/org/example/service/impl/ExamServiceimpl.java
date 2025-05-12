package org.example.service.impl;

import org.example.dto.Exam;
import org.example.service.ExamService;

import java.util.List;

public class ExamServiceimpl implements ExamService {
    @Override
    public void createExam(Exam exam) {

    }

    @Override
    public Exam getExamByCourseId(Integer integer) {
        return null;
    }

    @Override
    public List<Exam> getAll() {
        return List.of();
    }

    @Override
    public void updateExam(Exam exam) {

    }

    @Override
    public void deleteExamById(Integer id) {

    }

    @Override
    public void deleteExamByCourseId(Integer integer) {

    }
}
