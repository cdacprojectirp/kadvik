package com.cdac.irp.dao;
import java.util.List;

import com.cdac.irp.models.TimeTableUpdateRequestModel;
import com.cdac.irp.pojos.TimeTable;

public interface ITimeTableDao {
		List<TimeTable> getTimeTable(Integer data);
		List<TimeTable> getTimeTableAdmin(Integer courseId);
		List<TimeTableUpdateRequestModel> updateTimeTable(List<TimeTableUpdateRequestModel> _request);
}
