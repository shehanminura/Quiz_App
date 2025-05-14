package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Exam;
import org.example.service.ExamService;

import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    //http://localhost:8080/exam/create-exam

    final ExamService service;



    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
            service.createExam(exam);
    }

    @GetMapping("/get-exam-by-course-id/{id}")
    public Exam getExamByCourseId(@PathVariable Integer id){
        return service.getExamByCourseId(id);
    }
}
