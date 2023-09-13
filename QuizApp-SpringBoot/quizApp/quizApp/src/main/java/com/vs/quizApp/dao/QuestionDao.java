package com.vs.quizApp.dao;

import com.vs.quizApp.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends  JpaRepository<Questions,Integer> {

   public List<Questions> findByCategories(String categories);

}
