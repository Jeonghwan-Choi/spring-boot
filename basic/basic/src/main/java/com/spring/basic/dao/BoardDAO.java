package com.spring.basic.dao;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import javax.inject.Inject;

import com.spring.basic.model.Employee;

@Repository
public class BoardDAO {
    @Inject
   SqlSession sqlSession;

   public List<Employee> boardList() {
    System.out.println("run BoardDAO boardList()");
    return sqlSession.selectList("BoardDAO.boardList");
 }
}
