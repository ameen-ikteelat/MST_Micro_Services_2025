package com.mst.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mst.bean.Room;
import com.mst.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
    private RoomRepository roomRepository;
	
	// Create a new Room
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    // Get all Rooms
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    // Get a Room by ID
    public Room getRoomById(Long id) {
        Optional<Room> room = roomRepository.findById(id);
        return room.orElse(null);
    }

    // Update a Room
    public Room updateRoom(Long id, Room roomDetails) {
        Room room = roomRepository.findById(id).orElse(null);
        if (room != null) {
            room.setName(roomDetails.getName());
            room.setCapacity(roomDetails.getCapacity());
            return roomRepository.save(room);
        }
        return null;
    }

    // Delete a Room
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
	
	public List<Long> assignRooms( int numberOfRooms)
	{
		List<Room> rooms = roomRepository.findAll();
		return rooms.stream().limit(numberOfRooms).map(Room::getId).collect(Collectors.toList());
	}
    
}
