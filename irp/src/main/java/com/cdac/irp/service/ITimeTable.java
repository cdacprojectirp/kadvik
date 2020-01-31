package com.cdac.irp.service;
import java.util.List;

import com.cdac.irp.models.TimeTableUpdateRequestModel;
import com.cdac.irp.pojos.TimeTable;

public interface ITimeTable {

	List<TimeTable> getTimeTable(Integer page) throws Exception;
	List<TimeTable> getTimeTableAdmin(Integer courseId) throws Exception;
	List<TimeTableUpdateRequestModel> updateTimeTable(List<TimeTableUpdateRequestModel> _request) throws Exception;
}
