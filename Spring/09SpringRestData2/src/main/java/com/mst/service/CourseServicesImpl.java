package com.mst.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.beans.Course;
import com.mst.beans.Room;
import com.mst.service.exceptions.UnviersityException;
import com.mst.repository.CourseRepository;
import com.mst.repository.RoomRepository;

@Service
public class CourseServicesImpl implements CourseServices {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
    private RoomRepository roomRepository;
	
	@Override
	public Course saveCourse(Course course) throws UnviersityException{
		return courseRepository.save(course);

	}

	@Override
	public List<Room> findAvailableRoomsForCourse(Long courseId) {
		// Fetch the course
        Course course = courseRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));

        // Fetch all rooms associated with the course
        List<Room> availableRooms = roomRepository.findRoomsByCourseId(courseId);

        // Filter rooms based on their capacity
        return availableRooms.stream()
                .filter(room -> room.getCapacity() > room.getStudents().size())
                .collect(Collectors.toList());
    }
}
