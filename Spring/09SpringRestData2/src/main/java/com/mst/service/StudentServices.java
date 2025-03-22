package com.mst.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.mst.beans.*;
import com.mst.service.exceptions.RoomNotFoundException;
//@Service
public interface StudentServices {

	public List<Student> getAllStudents();
    public List<Student> getStudentNameInclude(String name);
    public List<Student> getStudentsByNameAndRoom(String name, String roomNumber);
    public List<Student> getStudentsWithMoreThanNCourses(int courseCount);
    public Student createStudent(Student student);
    public Optional<Student> getStudentById(Long studentId);
    public Room assignRoomToStudent(Long studentId, Integer roomId) throws RoomNotFoundException;
	public Set<Course> getCoursesForStudent(Long id);
	public Set<Room> getRoomsForStudent(Long id);
	public void buildLearningPlan(Long id, List<Long> courseIds);
	
}
