package com.example.quizapp.controller;

import com.example.quizapp.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("question")
public class QuestionController {
   @Autowired
   QuestionService questionService;
   @GetMapping("allQuestions")
   public String getAllQuestions() {
	  return questionService.getAllQuestions();
   }
}
