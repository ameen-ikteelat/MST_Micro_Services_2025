package com.mst.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.repository.CourseRepository;
import com.mst.repository.beans.Course;

@Service
public class CourseServices {

	@Autowired
    private CourseRepository courseRepository;

 

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Long id, Course updatedCourse) {
        return courseRepository.findById(id)
            .map(course -> {
                course.setName(updatedCourse.getName());
                course.setDescription(updatedCourse.getDescription());
                return courseRepository.save(course);
            })
            .orElseThrow(() -> new IllegalArgumentException("Course not found"));
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}