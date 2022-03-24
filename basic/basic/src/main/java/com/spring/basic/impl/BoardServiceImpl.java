package com.spring.basic.impl;

import java.util.List;

import com.spring.basic.dao.BoardDAO;
import com.spring.basic.model.BasicDto;
import com.spring.basic.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<Employee> boardList() {
		System.out.println("run BoardServiceImpl boardList()");
		return boardDAO.boardList();
	}

	@Override
	public int basicCount() {
		System.out.println("run BoardServiceImpl basicCount()");
		return boardDAO.basicCount();
	}

	@Override
	public String basicName() {
		System.out.println("run BoardServiceImpl basicName()");
		return boardDAO.basicName();
	}

	@Override
	public BasicDto basicData() {
		// TODO Auto-generated method stub
		return boardDAO.basicData();
	}

	@Override
	public List<BasicDto> basicList() {
		// TODO Auto-generated method stub
		return boardDAO.basicList();
	}
}
