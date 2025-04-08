package com.mst;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.mst.controller.CourseController;
import com.mst.repository.beans.Course;
import com.mst.services.CourseServices;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(CourseController.class)
public class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CourseServices courseService;

    @InjectMocks
    private CourseController courseController;

    @Test
    public void testGetCourseById() throws Exception {
        Course course = new Course("Java Basics", "Introduction to Java");
        when(courseService.getCourseById(1L)).thenReturn(Optional.of(course));

        mockMvc.perform(get("/courses/1"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Java Basics"));
    }
}