package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Exam;
import org.example.service.ExamService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
