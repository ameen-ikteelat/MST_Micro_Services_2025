package com.mst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mst.repository.beans.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
