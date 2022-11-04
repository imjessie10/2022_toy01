package com.spring.toy01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.toy01.dao.RoomDAO;
import com.spring.toy01.dto.RoomDTO;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	RoomDAO roomDAO;
	
	public int insertRoom(RoomDTO roomDTO) {		
		return roomDAO.insertRoom(roomDTO);
	}
	
	public List selectRoom() {
		return roomDAO.selectRoom();
	}

	@Override
	public int updateRoom(RoomDTO roomDTO) {
		return roomDAO.updateRoom(roomDTO);
	}

	@Override
	public RoomDTO selectRoomInfo(int room_id) {
		return roomDAO.selectRoomInfo(room_id);
	}
}
