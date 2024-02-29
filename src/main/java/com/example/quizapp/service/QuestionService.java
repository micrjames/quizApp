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

   public String updateQuestion(Question newQuestion, int id) {
	  Question question = questionDao.findById(id).get();
	  question.setQuestion(newQuestion.getQuestion());
	  question.setOption1(newQuestion.getOption1());
	  question.setOption2(newQuestion.getOption2());
	  question.setOption3(newQuestion.getOption3());
	  question.setOption4(newQuestion.getOption4());
	  question.setRightanswer(newQuestion.getRightanswer());
	  questionDao.save(question);
	  return "success";
   }

   public String deleteQuestion(int id) {
	  questionDao.deleteById(id);
	  return "success";
   }
}
