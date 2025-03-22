package com.mst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mst.beans.Course;
import com.mst.beans.Room;
import com.mst.controller.responses.*;
import com.mst.service.CourseServices;
import com.mst.service.exceptions.UnviersityException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/courses")
public class CourseController {

	@Autowired
	private CourseServices courseServices;
	

	
	@GetMapping("/avaiblerooms/{id}")
	public ResponseEntity<?> getCourseAvailbleRooms (@PathVariable Long courseId)
	{
		try{
			List<Room> availbleRooms = courseServices.findAvailableRoomsForCourse(courseId);
			return new ResponseEntity<>(availbleRooms , HttpStatus.OK);
		}catch( Exception e)
		{
			return new ResponseEntity<>( new ErrorResponse( e.getMessage(),"Course not found"), HttpStatus.NOT_FOUND );
		}
		
	}
	
	@PostMapping(value ="/createcourse" , consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> createNewCourse(@RequestBody Course course) {
		try {
		Course createdCourse = courseServices.saveCourse(course);
		return  new ResponseEntity<>(createdCourse , HttpStatus.CREATED);
		}catch( UnviersityException ex)
		{
			return  new ResponseEntity<> ( new ErrorResponse(ex.getMessage() ,
							"Error while creating course entity , please check your inputs"),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
}
