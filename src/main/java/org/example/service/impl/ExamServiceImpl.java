package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.Exam;
import org.example.repository.ExamRepository;
import org.example.service.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {

    final ExamRepository repository;

    @Override
    public void createExam(Exam exam) {
    //repository.save()
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
