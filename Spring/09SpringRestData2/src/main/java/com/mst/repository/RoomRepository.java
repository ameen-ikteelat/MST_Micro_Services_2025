package com.mst.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mst.beans.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {

	@Query("SELECT r FROM Room r WHERE r.id = :roomId")
	Optional<Room> findById(@Param("roomId") Integer roomId);


	@Query("SELECT r FROM Room r JOIN r.courses c WHERE c.id = :courseId")
	Set<Room> findRoomsForCourse(@Param("courseId") Long courseId);

	@Query("SELECT r FROM Room r JOIN r.courses c WHERE c.id = :courseId")
	List<Room> findRoomsByCourseId(@Param("courseId") Long courseId);
}
