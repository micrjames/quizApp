package com.example.quizapp.controller;

import java.util.List;
import com.example.quizapp.model.Question;
import com.example.quizapp.service.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/")
public class QuestionController {
   @Autowired
   QuestionService questionService;

   @GetMapping("questions")
   public List<Question> getAllQuestions() {
	  return questionService.getAllQuestions();
   }
   @GetMapping("question/{id}")
   public Question getQuestionById(@PathVariable int id) {
	  return questionService.getQuestionById(id);
   }

   @PostMapping("questions")
   public String addQuestion(@RequestBody Question question) {
	  return questionService.addQuestion(question);
   }
}
