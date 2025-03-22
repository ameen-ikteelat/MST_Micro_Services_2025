package com.mst.service;

import java.util.List;

import com.mst.beans.*;
import com.mst.service.exceptions.UnviersityException;


public interface CourseServices {
	public Course saveCourse(Course course) throws  UnviersityException;
	List<Room> findAvailableRoomsForCourse(Long courseId);
}
