package com.example.quizapp.service;

import com.example.quizapp.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

   public String getAllQuestions() {
	  return "These are some questions.";
   }
}
