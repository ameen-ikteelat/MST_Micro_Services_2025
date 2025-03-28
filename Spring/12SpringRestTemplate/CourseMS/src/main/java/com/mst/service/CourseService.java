package com.mst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.bean.Course;
import com.mst.repository.CourseRepository;
import com.mst.service.exceptions.CourseNotFoundException;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	 public Course createCourse(Course course) {
	        return courseRepository.save(course);
	    }
	 
	 public Course getCourseById(Long id) throws CourseNotFoundException {
		  return courseRepository.findById(id)
		            .orElseThrow(() -> new CourseNotFoundException("Course not found with id " + id));
	}

	 public Course updateCourse ( Long id, Course courseDetails) throws CourseNotFoundException
	 {
		 Course course = getCourseById(id);
		 course.setName(courseDetails.getName());
		 course.setRoomIds(courseDetails.getRoomIds());
		 course.setStudentIds(courseDetails.getStudentIds());
		 
		 return courseRepository.save(course);
	 }
	 
	 public void deleteCourse(Long id)
	 {
		 courseRepository.deleteById(id);
	 }
	 
	 public Course enrollStudent(Long courseId, Long studentId) {
	        Course course = courseRepository.findById(courseId)
	            .orElseThrow(() -> new RuntimeException("Course not found"));
	        course.getStudentIds().add(studentId);
	        return courseRepository.save(course);
	    }
}
