package com.vs.quizApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String categories;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightanswer;
    private String questiontitle;

}
