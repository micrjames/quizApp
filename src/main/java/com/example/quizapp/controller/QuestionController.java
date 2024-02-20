package com.example.quizapp.controller;

import java.util.List;
// import com.example.quizapp.Question;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
   @Autowired
   QuestionService questionService;

   @GetMapping("allQuestions")
   // public List<Question> getAllQuestions() {
   public String getAllQuestions() {
	  return questionService.getAllQuestions();
   }
}
