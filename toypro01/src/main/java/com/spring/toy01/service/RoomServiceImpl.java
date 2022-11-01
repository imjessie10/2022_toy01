package com.spring.toy01.service;

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
}
