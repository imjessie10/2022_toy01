package com.spring.toy01.dao;

import java.util.List;

import com.spring.toy01.dto.RoomDTO;

public interface RoomDAO {
	
	public int insertRoom(RoomDTO roomDTO);
	
	public int updateRoom(RoomDTO roomDTO);
	
	public List selectRoom();

	public RoomDTO selectRoomInfo(int room_id);
}
