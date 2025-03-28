package com.mst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mst.bean.Room;
import com.mst.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class Controller {

	@Autowired
	private RoomService roomService;

	@PostMapping("/createroom")
	public ResponseEntity<Room> createRoom(@RequestBody Room room) {
		Room createdRoom = roomService.createRoom(room);
		return new ResponseEntity<>(createdRoom, HttpStatus.CREATED);
	}

	@GetMapping("/getrooms")
	public List<Room> getAllRooms() {
		return roomService.getAllRooms();
	}

	@GetMapping("getroom/{id}")
	public ResponseEntity<Room> getRoomById(@PathVariable Long id) {
		Room room = roomService.getRoomById(id);
		if (room == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(room, HttpStatus.OK);
	}

	@PutMapping("updateroom/{id}")
	public ResponseEntity<Room> updateRoom(@PathVariable Long id, @RequestBody Room roomDetails) {
		Room updatedRoom = roomService.updateRoom(id, roomDetails);
		if (updatedRoom == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(updatedRoom, HttpStatus.OK);
	}

	// Delete Room
	@DeleteMapping("delete/{id}")
	public ResponseEntity<HttpStatus> deleteRoom(@PathVariable Long id) {
		roomService.deleteRoom(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/assign/{number}")
	public ResponseEntity<List<Long>> assignRooms(@PathVariable int number) {
		List<Long> roomIds = roomService.assignRooms(number);
		return ResponseEntity.ok(roomIds);
	}
}
