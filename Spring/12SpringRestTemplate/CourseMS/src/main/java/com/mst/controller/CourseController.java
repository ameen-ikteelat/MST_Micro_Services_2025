package com.mst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mst.bean.Course;
import com.mst.service.CourseService;
import com.mst.service.exceptions.CourseNotFoundException;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	
	@Value("${room.service.url}")
	private String roomServiceUrl;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private CourseService courseService;

	@PostMapping("/{courseId}/enroll")
	public ResponseEntity<Course> enrollStudent(@RequestBody  Long studentId , @PathVariable Long courseId)
	{
		return ResponseEntity.ok(courseService.enrollStudent(courseId, studentId));
	}
	
	
	@PostMapping("/createcourse")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		// invoke assignRooms from Room MS
		ResponseEntity<List<Long>> roomResponse = restTemplate.exchange(roomServiceUrl+"/api/rooms/assign/3", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Long>>() {
				});
		List<Long> roomIds = roomResponse.getBody();
		course.setRoomIds(roomIds);
		return ResponseEntity.ok (courseService.createCourse(course));
	}

	@GetMapping("/getcourse/{id}")
	public ResponseEntity<?> getCourseById(@PathVariable Long id) {
		Course course;
		try {
			course = courseService.getCourseById(id);
			return ResponseEntity.ok(course);
		} catch (CourseNotFoundException e) {
			return new ResponseEntity("Course Not Found", HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("update/{id}")
	public ResponseEntity<?> updateCourse(@PathVariable Long id, @RequestBody Course courseDetails) {
		Course updatedCourse;
		try {
			updatedCourse = courseService.updateCourse(id, courseDetails);
			return ResponseEntity.ok(updatedCourse);
		} catch (CourseNotFoundException e) {
			return new ResponseEntity("Course Not Found", HttpStatus.NOT_FOUND);
		}

	}

	// Delete a course
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
		courseService.deleteCourse(id);
		return ResponseEntity.noContent().build();
	}

}
