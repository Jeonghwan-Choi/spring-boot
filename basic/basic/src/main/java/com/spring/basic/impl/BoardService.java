package com.spring.basic.impl;

import java.util.List;

import com.spring.basic.model.BasicDto;
import com.spring.basic.model.Employee;

public interface BoardService {
	List<Employee> boardList();

	public int basicCount();

	public String basicName();

	public BasicDto basicData();

	List<BasicDto> basicList();

}
