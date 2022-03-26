package com.spring.basic.repository;

import com.spring.basic.model.BasicDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends JpaRepository<BasicDto, Long>{
    
}
