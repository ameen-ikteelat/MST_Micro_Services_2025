package com.mst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mst.bean.Course;



@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
