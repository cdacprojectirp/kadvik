package com.cdac.irp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cdac.irp.pojos.PKStudentSubject;
import com.cdac.irp.pojos.Result;
import com.cdac.irp.pojos.Student;
import com.cdac.irp.pojos.Subject;

public interface IResultJpaDao extends JpaRepository<Result, PKStudentSubject> {

	@Query("SELECT r FROM Result r WHERE r.subject= :subject")
	public List<Result> findResultsBySubject(Subject subject);

	public Result findTopBySubjectOrderByMarksDesc(Subject subject);
	
	public List<Result> findAllByMarks(Integer marks);
	
	@Query("SELECT r FROM Result r WHERE r.student= :student")
	public List<Result> findResultsByStudent(Student student);
	
	//public Result findByStudentByOrderByMarksDesc();
}