package com.cdac.irp.dao;
import java.util.List;

import com.cdac.irp.models.TimeTableUpdateRequestModel;
import com.cdac.irp.pojos.TimeTable;

public interface ITimeTableDao {
		List<TimeTable> getTimeTable(Integer data)throws Exception;
		List<TimeTable> getTimeTableAdmin(Integer courseId)throws Exception;
		List<TimeTableUpdateRequestModel> updateTimeTable(List<TimeTableUpdateRequestModel> _request)throws Exception;
}
