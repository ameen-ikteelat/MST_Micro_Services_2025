package com.mst.service;

import com.mst.beans.Room;
import com.mst.service.exceptions.RoomNotFoundException;


public interface RoomServices {
	public Room createRoom(Room room);
	public Room getRoomById(int roomId) throws RoomNotFoundException;
	public Room updateRoomCapacity(Integer roomId, int capacity) throws RoomNotFoundException;
}
