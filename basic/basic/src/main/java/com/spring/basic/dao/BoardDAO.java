package com.spring.basic.dao;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import javax.inject.Inject;

import com.spring.basic.model.BasicDto;
import com.spring.basic.model.Employee;

@Repository
public class BoardDAO {
	@Inject
	SqlSession sqlSession;

	public List<Employee> boardList() {
		System.out.println("run BoardDAO boardList()");
		return sqlSession.selectList("BoardDAO.boardList");
	}

	public int basicCount() {
		// mapper.xml || namespace.id
		System.out.println("run BoardDAO basiccount() go to mapper");
		return sqlSession.selectOne("BoardDAO.basicCount");
	}

	public String basicName() {
		// mapper.xml || namespace.id
		System.out.println("run BoardDAO basicname() go to mapper");
		return sqlSession.selectOne("BoardDAO.basicName");
	}

	public BasicDto basicData() {
		return sqlSession.selectOne("BoardDAO.basicName");
	}

	public List<BasicDto> basicList() {
		return sqlSession.selectList("BoardDAO.basicList");
	}

}
