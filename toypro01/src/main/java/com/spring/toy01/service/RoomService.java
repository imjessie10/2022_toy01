package com.spring.toy01.service;

import java.util.List;

import com.spring.toy01.dto.RoomDTO;

public interface RoomService {
	public int insertRoom(RoomDTO roomDTO);
	
	public List selectRoom();
	
	public int updateRoom(RoomDTO roomDTO);

	public RoomDTO selectRoomInfo(int room_id);
}
