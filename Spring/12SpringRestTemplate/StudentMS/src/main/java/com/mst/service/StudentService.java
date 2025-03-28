package com.mst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.bean.Student;
import com.mst.repository.StudentRepository;
import com.mst.service.exceptions.StudentNotFoundException;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	public Student createStudent(Student student) throws StudentNotFoundException{
		return studentRepository.save(student);
	}

	public Student updateStudent(Long id, Student studentDetails) {
		 Student student = getStudentById(id);

	        student.setName(studentDetails.getName());
	        student.setEmail(studentDetails.getEmail());

	        return studentRepository.save(student);
		
	}

	public void deleteStudent(Long id) {
		 Student student = getStudentById(id);
	     studentRepository.delete(student);
	}
}
