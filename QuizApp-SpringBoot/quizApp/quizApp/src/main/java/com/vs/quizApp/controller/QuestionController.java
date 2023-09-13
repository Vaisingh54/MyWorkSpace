package com.vs.quizApp.controller;


import com.vs.quizApp.entity.Questions;
import com.vs.quizApp.service.QuestionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService service ;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){

        return service.getAllQuestions();
    }

    @GetMapping("getById/{categories}")
    public ResponseEntity<List<Questions>> getQuestionById(@PathVariable String categories){
        return service.getQuestionById(categories);
    }

    @PostMapping("addQuestions")
    public ResponseEntity<String> addQuestion(@RequestBody Questions questions){
        return service.addQuestion(questions);
    }


}
