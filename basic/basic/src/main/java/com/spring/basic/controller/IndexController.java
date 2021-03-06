package com.spring.basic.controller;

import java.util.List;

import com.spring.basic.impl.BoardService;
import com.spring.basic.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class IndexController {

@Autowired
    BoardService boardService;

    @RequestMapping("/main")
    public String TT(){
        System.out.println("test");
        return "tt";
    }

    @GetMapping("/health")
    public List<Employee> health(){
        List<Employee> testList = boardService.boardList();
        System.out.println(testList.size());
        return testList;
    }

}
