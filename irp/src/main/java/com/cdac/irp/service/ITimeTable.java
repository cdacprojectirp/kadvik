package com.cdac.irp.service;
import java.util.List;
import com.cdac.irp.pojos.TimeTable;

public interface ITimeTable {

	List<TimeTable> getTimeTable(Integer page);
}
