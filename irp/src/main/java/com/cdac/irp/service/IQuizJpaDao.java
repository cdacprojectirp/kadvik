package com.cdac.irp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.irp.pojos.Question;

public interface IQuizJpaDao extends JpaRepository<Question, Integer> {
	
}
