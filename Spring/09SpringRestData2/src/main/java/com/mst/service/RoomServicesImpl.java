package com.mst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.beans.Room;
import com.mst.repository.RoomRepository;
import com.mst.service.exceptions.RoomNotFoundException;

@Service
public class RoomServicesImpl implements RoomServices {

	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public Room createRoom(Room room) {
		
		return roomRepository.save(room);
	}

    @Override
    public Room getRoomById(int roomId) throws RoomNotFoundException {
        return roomRepository.findById(roomId)
                .orElseThrow(() -> new RoomNotFoundException("Room with ID " + roomId + " not found"));
    }
    
    public Room updateRoomCapacity(Integer roomId, int capacity) throws RoomNotFoundException {
        Room room = roomRepository.findById(roomId)
            .orElseThrow(() -> new RoomNotFoundException("Room not found"));
        room.setCapacity(capacity);
        return roomRepository.save(room);
    }

    

}
