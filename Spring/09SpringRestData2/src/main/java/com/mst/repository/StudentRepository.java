package com.mst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mst.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findByNameContaining(String name);

    List<Student> findByCourses_Name(String name);
    
    List<Student> findByNameAndRoomNumber(String name, String roomNumber);
   
    @Query("SELECT s FROM Student s WHERE size(s.courses) > :courseCount")
    List<Student> findStudentsWithMoreThanNCourses(@Param("courseCount") int courseCount);

}
