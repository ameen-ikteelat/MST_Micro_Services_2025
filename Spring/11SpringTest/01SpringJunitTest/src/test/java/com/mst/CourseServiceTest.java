package com.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mst.repository.CourseRepository;
import com.mst.repository.beans.Course;
import com.mst.services.CourseServices;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseServices courseService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetCourseById() {
        Course course = new Course("Java Basics", "Introduction to Java");
        when(courseRepository.findById(1L)).thenReturn(Optional.of(course));

        Optional<Course> foundCourse = courseService.getCourseById(1L);
        assertEquals("Java Basics", foundCourse.get().getName());
    }
}