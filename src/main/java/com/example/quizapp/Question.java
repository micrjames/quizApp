package com.example.quizapp;
<<<<<<< HEAD

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> 2230d4a (created basic files for app)
import lombok.Data;

@Data
@Entity
public class Question {
<<<<<<< HEAD

=======
>>>>>>> 2230d4a (created basic files for app)
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer id;
   private String questionTitle;
   private String option1;
   private String option2;
   private String option3;
   private String option4;
   private String rightAnswer;
   private String difficultylevel;
}
