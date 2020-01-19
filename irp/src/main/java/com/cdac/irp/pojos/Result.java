package com.cdac.irp.pojos;

import javax.persistence.*;

@Entity
public class Result {

	@EmbeddedId
	private PKStudentSubject result_id;

	@MapsId("prn") // map embeddable primary key prn with student table
	@ManyToOne
	@JoinColumn(name = "prn") // to keep column name as prn, else the name becomes student_prn ie
								// instanceName_its pk name
	private Student student;

	@MapsId("subjectId")
	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	private Integer marks;

	public Result() {
		System.out.println("in result pojo");
	}

}
