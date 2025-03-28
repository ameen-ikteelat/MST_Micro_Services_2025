package com.mst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mst.bean.Room;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
