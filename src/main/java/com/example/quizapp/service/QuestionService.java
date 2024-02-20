package com.example.quizapp.service;

import com.example.quizapp.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

   // public List<Question> getAllQuestions() {
   public String getAllQuestions() {
	  return "Here are the questions!";
   }
}
