package com.cdac.irp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.IResultJpaDao;
import com.cdac.irp.dao.IStudentDao;
import com.cdac.irp.dao.ISubjectDao;
import com.cdac.irp.models.ResultRequestModel;
import com.cdac.irp.pojos.PKStudentSubject;
import com.cdac.irp.pojos.Result;
import com.cdac.irp.pojos.Student;
import com.cdac.irp.pojos.Subject;

@Service
public class ResultServiceImpl implements IResultService {

	@Autowired
	private IResultJpaDao jpaDao;
	@Autowired
	private IStudentDao stuDao;
	@Autowired
	private ISubjectDao subDao;

	@Override
	public void submitResult(ResultRequestModel resModel) throws Exception{
		Student stu = stuDao.getStudentByPrn(resModel.getPrn());
		Subject sub = subDao.getSubject(resModel.getSubjectId());
		PKStudentSubject result_id = new PKStudentSubject();
		result_id.setPrn(resModel.getPrn());
		result_id.setSubjectId(resModel.getSubjectId());
		Result result = new Result();
		result.setResult_id(result_id);
		result.setStudent(stu);
		result.setSubject(sub);
		result.setMarks(resModel.getMarks());
		jpaDao.save(result);

	}

	@Override
	public List<Result> getResultlist(Integer subjectId) throws Exception{
		Subject sub = subDao.getSubject(subjectId);
		return jpaDao.findResultsBySubject(sub);
	}

	@Override
	public List<Student> getTopperBySubject(Integer subjectId) throws Exception{
		Subject sub = subDao.getSubject(subjectId);
		Result res = jpaDao.findTopBySubjectOrderByMarksDesc(sub);
		List<Result> results = jpaDao.findAllByMarks(res.getMarks());
		List<Student> students = new ArrayList<>();
		for (Result result : results) {
			students.add(result.getStudent());
		}
		return students;
	}

	@Override
	public Student getTopperByCourse(Integer courseId) throws Exception{
		// System.out.println(jpaDao.findTopByOrderByMarksDesc());
		return null;
	}

	@Override
	public List<Result> getResultsByPrn(Integer prn) throws Exception{
		Student stu = stuDao.getStudentByPrn(prn);
		List<Result> report = jpaDao.findResultsByStudent(stu);
		return report;
	}

}
