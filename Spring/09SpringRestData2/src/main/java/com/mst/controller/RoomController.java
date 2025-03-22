package com.mst.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mst.beans.Room;
import com.mst.service.RoomServices;
import com.mst.service.exceptions.RoomNotFoundException;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

	@Autowired
	private RoomServices roomServices;

	@PostMapping("/create")
	public ResponseEntity<Room> createNewRoom(@RequestBody Room room) {
		Room savedRoom = roomServices.createRoom(room);
		return new ResponseEntity<>(savedRoom, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getRoomById(@PathVariable int id) {
		Room room;
		try {
			room = roomServices.getRoomById(id);
			return new ResponseEntity<>(room, HttpStatus.OK);
		} catch (RoomNotFoundException e) {
			
			return handleRoomNotFoundException(e);
		}
	}

	@PutMapping("/{id}/checkcapacity")
	public ResponseEntity<?> updateRoomCapacity(@PathVariable int id, @RequestParam  int capacity) {
		Room updatedRoom;
		try {
			updatedRoom = roomServices.updateRoomCapacity(id, capacity);
			return new ResponseEntity<>(updatedRoom, HttpStatus.OK);
		} catch (RoomNotFoundException e) {
			return handleRoomNotFoundException(e);
		}
		
	}

	@ExceptionHandler(RoomNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleRoomNotFoundException(RoomNotFoundException ex) {
		Map<String, String> errorResponse = new HashMap<>();
		errorResponse.put("message", ex.getMessage());
		errorResponse.put("details", "The requested room could not be found");
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
}
