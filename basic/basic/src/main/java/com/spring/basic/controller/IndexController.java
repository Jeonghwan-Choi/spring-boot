package com.spring.basic.controller;

import java.util.List;

import com.spring.basic.dao.BoardDAO;
import com.spring.basic.impl.BoardService;
import com.spring.basic.model.BasicDto;
import com.spring.basic.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String TT() {
		System.out.println("test");
		return "tt";
	}

	@GetMapping("/health")
	public List<Employee> health() {
		List<Employee> testList = boardService.boardList();
		System.out.println(testList.size());
		return testList;
	}

	@GetMapping("/count")
	public int basicCount() {
		System.out.println("/count controller 호출");
		int count;
		count = boardService.basicCount();

		return count;
	}

	@GetMapping("/name")
	public String basicName() {
		System.out.println("/count controller 호출");
		String name;

		name = boardService.basicName();

		return name;
	}

	@GetMapping("/data")
	public String basicData() {
		System.out.println("/data controller 호출");

		// Dto에 데이터 삽입
		BasicDto bd = boardService.basicData();

		// Dto에서 데이터 가져오기
		String name = bd.getName();
		String customer = bd.getCustomer();
		String number = bd.getNumber();

		bd.setName("123");

		return bd.getName() + " - " + customer + " - " + bd.getNumber() + "//";
	}

	@GetMapping("/datalist")
	public List<BasicDto> basicList() {

		List<BasicDto> basicList = boardService.basicList();
		BasicDto bd = boardService.basicData();

		return basicList;
	}
}
