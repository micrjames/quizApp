package com.example.quizapp.service;

<<<<<<< HEAD
import com.example.quizapp.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

   // public List<Question> getAllQuestions() {
   public String getAllQuestions() {
	  return "Here are the questions!";
=======
import org.springframework.stereotype.Service;
@Service
public class QuestionService {
   public String getAllQuestions() {
	  return "These are some questions.";
>>>>>>> 2230d4a (created basic files for app)
   }
}
