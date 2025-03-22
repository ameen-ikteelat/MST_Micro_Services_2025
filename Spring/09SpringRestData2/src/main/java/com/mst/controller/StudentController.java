package com.mst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mst.beans.Course;
import com.mst.beans.Room;
import com.mst.beans.Student;
import com.mst.service.StudentServices;
import com.mst.service.exceptions.RoomNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/students")
public class StudentController {  

    @Autowired
    private StudentServices studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

   

    @GetMapping("/search/by-room")
    public List<Student> findStudentsByNameAndRoom(@RequestParam String name, @RequestParam String roomNumber) {
        return studentService.getStudentsByNameAndRoom(name, roomNumber);
    }

    @GetMapping("/course-count")
    public List<Student> findStudentsWithMoreThanNCourses(@RequestParam int courseCount) {
        return studentService.getStudentsWithMoreThanNCourses(courseCount);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.createStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Optional<Student> student = studentService.getStudentById(id);
        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/learning-plan")
    public ResponseEntity<Void> buildLearningPlan(@PathVariable Long id, @RequestBody List<Long> courseIds) {
        studentService.buildLearningPlan(id, courseIds);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/rooms")
    public ResponseEntity<Set<Room>> getRoomsForStudent(@PathVariable Long id) {
        Set<Room> rooms = studentService.getRoomsForStudent(id);
        return ResponseEntity.ok(rooms);
    }

    @GetMapping("/{id}/courses")
    public ResponseEntity<Set<Course>> getCoursesForStudent(@PathVariable Long id) {
        Set<Course> courses = studentService.getCoursesForStudent(id);
        return ResponseEntity.ok(courses);
    }

    @PostMapping("/{studentId}/assign-room/{roomId}")
    public ResponseEntity<?> assignRoomToStudent(@PathVariable Long studentId, @PathVariable int roomId) {
        Room room;
		try {
			room = studentService.assignRoomToStudent(studentId, roomId);
			return ResponseEntity.ok(room);
		} catch (RoomNotFoundException e) {
			return handleRoomNotFoundException(e);
		}
        
    }

   
    @ExceptionHandler(RoomNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleRoomNotFoundException(RoomNotFoundException ex) {
		Map<String, String> errorResponse = new HashMap<>();
		errorResponse.put("message", ex.getMessage());
		errorResponse.put("details", "The requested room could not be found");
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
}
