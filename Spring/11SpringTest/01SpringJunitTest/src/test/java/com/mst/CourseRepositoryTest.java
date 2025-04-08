package com.mst;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import com.mst.repository.CourseRepository;
import com.mst.repository.beans.Course;

@ContextConfiguration(classes =Application.class)
@DataJpaTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void testFindAll() {
        Course course1 = new Course("Java Basics", "Introduction to Java");
        Course course2 = new Course("Spring Boot", "Spring Boot Essentials");
        courseRepository.save(course1);
        courseRepository.save(course2);

        List<Course> courses = courseRepository.findAll();
        assertEquals(2, courses.size());
    }
}