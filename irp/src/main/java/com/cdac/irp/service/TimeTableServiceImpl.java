package com.cdac.irp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.ITimeTableDao;
import com.cdac.irp.pojos.TimeTable;

@Service
@Transactional
public class TimeTableServiceImpl implements ITimeTable {

	@Autowired
	private ITimeTableDao dao;
	
	@Override
	public  List<TimeTable> getTimeTable(Integer data)
	{
		return dao.getTimeTable(data);
	}

}
