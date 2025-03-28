package com.mst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

import com.mst.bean.Student;
import com.mst.service.StudentService;
import com.mst.service.exceptions.StudentNotFoundException;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Value("${course.service.url}")
	private String courseServiceUrl;
	 
	@Autowired
    StudentService studentService; 
	
	
	@Autowired
    private RestTemplate restTemplate;
	
	
	@PostMapping("/{studentId}/enroll/{courseId}" )
	public ResponseEntity<Void> enrollStudent (@PathVariable Long studentId , @PathVariable Long courseId )
	{
		return restTemplate.postForEntity(courseServiceUrl+ "/api/courses/"+courseId+"/enroll" , studentId , Void.class);
	}
	
	
	@GetMapping("getstudent/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    // Create a new student
    @PostMapping("createnewstudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = null;
		try {
			createdStudent = studentService.createStudent(student);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    // Update student information
    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        Student updatedStudent = studentService.updateStudent(id, studentDetails);
        return ResponseEntity.ok(updatedStudent);
    }

    // Delete a student
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
