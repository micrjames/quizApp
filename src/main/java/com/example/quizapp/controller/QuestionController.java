package com.example.quizapp.controller;

<<<<<<< HEAD
import java.util.List;
// import com.example.quizapp.Question;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.example.quizapp.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 2230d4a (created basic files for app)

@RestController
@RequestMapping("question")
public class QuestionController {
   @Autowired
   QuestionService questionService;
<<<<<<< HEAD

   @GetMapping("allQuestions")
   // public List<Question> getAllQuestions() {
=======
   @GetMapping("allQuestions")
>>>>>>> 2230d4a (created basic files for app)
   public String getAllQuestions() {
	  return questionService.getAllQuestions();
   }
}
