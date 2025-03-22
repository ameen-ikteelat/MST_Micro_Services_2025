package com.mst.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.beans.Course;
import com.mst.beans.Room;
import com.mst.beans.Student;
import com.mst.repository.CourseRepository;
import com.mst.repository.RoomRepository;
import com.mst.repository.StudentRepository;
import com.mst.service.exceptions.RoomNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getStudentNameInclude(String name) {
        return studentRepository.findByNameContaining(name);
    }

    public List<Student> getStudentsByNameAndRoom(String name, String roomNumber) {
        return studentRepository.findByNameAndRoomNumber(name, roomNumber);
    }

    public List<Student> getStudentsWithMoreThanNCourses(int courseCount) {
        return studentRepository.findStudentsWithMoreThanNCourses(courseCount);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }

    public Room assignRoomToStudent(Long studentId, Integer roomId) throws RoomNotFoundException {
        Optional<Student> student = studentRepository.findById(studentId);
        Optional<Room> room = roomRepository.findById(roomId);
        if (!room.isPresent()) {
            throw new RoomNotFoundException("Room not found");
        }
        student.ifPresent(s -> s.setRoom(room.get()));
        return roomRepository.save(room.get());
    }

 

    // Build a learning plan for a student
    public void buildLearningPlan(Long studentId, List<Long> selectedCourses) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        for (Long courseId : selectedCourses) {
            Course course = courseRepository.findById(courseId)
                    .orElseThrow(() -> new RuntimeException("Course not found"));

            Set<Room> availableRooms = roomRepository.findRoomsForCourse(course.getId());

            Room selectedRoom = availableRooms.stream()
                    .filter(room -> room.getCapacity() > room.getStudents().size())
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No room available for course " + course.getName()));

            student.getCourses().add(course);
            selectedRoom.getStudents().add(student);

            roomRepository.save(selectedRoom); // Update room
        }

        studentRepository.save(student); // Update student with chosen courses and rooms
    }

    // Get rooms assigned to a student
    public Set<Room> getRoomsForStudent(Long studentId) {
        return studentRepository.findById(studentId)
                .map(Student::getRoom)
                .map(Set::of)
                .orElseThrow(() -> new RuntimeException("Student not found or has no assigned room"));
    }

    // Get courses assigned to a student
    public Set<Course> getCoursesForStudent(Long studentId) {
        return studentRepository.findById(studentId)
                .map(Student::getCourses)
                .orElseThrow(() -> new RuntimeException("Student not found or has no assigned courses"));
    }
}


	
