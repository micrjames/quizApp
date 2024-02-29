package com.example.quizapp.service;

import java.util.List;
import com.example.quizapp.model.Question;
import com.example.quizapp.dao.QuestionDao;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class QuestionService {
   @Autowired
   QuestionDao questionDao;

   public List<Question> getAllQuestions() {
	  return questionDao.findAll();
   }

   public String addQuestion(Question question) {
	  questionDao.save(question);
	  return "success";
   }

   public Question getQuestionById(int id) {
	  return questionDao.findById(id).get();
   }
}
