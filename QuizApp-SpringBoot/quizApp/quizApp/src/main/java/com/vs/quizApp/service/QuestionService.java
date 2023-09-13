package com.vs.quizApp.service;

import com.vs.quizApp.dao.QuestionDao;
import com.vs.quizApp.entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {


    @Autowired
    private QuestionDao questionDao;


    public ResponseEntity<List<Questions>> getAllQuestions() {

        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

        }

   public ResponseEntity<List<Questions>> getQuestionById(String categories) {
        try{
            return  new ResponseEntity<>(questionDao.findByCategories(categories), HttpStatus.FOUND);

        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }



    public ResponseEntity<String> addQuestion(Questions questions) {


        try{
            questionDao.save(questions);
            return new ResponseEntity<>("Success", HttpStatus.CREATED);

        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Something went wrong", HttpStatus.NOT_ACCEPTABLE);
    }
}
