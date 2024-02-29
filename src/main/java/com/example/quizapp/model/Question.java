package com.example.quizapp.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class Question {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY) //.SEQUENCE)
   private Integer id;
   private String question;
   private String option1;
   private String option2;
   private String option3;
   private String option4;
   private String rightanswer;
}
