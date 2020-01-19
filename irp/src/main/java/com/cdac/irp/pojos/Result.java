package com.cdac.irp.pojos;

import javax.persistence.*;

@Entity
public class Result {

	// @EmbeddedId
	// private PKStudentSubject pkStudentSubject;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer resultId;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;
	@OneToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;
	
	private Integer marks;

	public Result() {
		System.out.println("in result pojo");
	}

}
