package com.spring.toy01.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.toy01.dto.RoomDTO;

@Repository
public class RoomDAOImpl implements RoomDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertRoom(RoomDTO roomDTO) {
		return sqlSession.insert("mapper.room.insertRoom", roomDTO);
	}
	
	public int updateRoom(RoomDTO roomDTO) {
		return sqlSession.update("mapper.room.updateRoom", roomDTO);
	}
	
	public List selectRoom() {
		return sqlSession.selectList("mapper.room.selectRoom");
	}

	public RoomDTO selectRoomInfo(int room_id) {
		return sqlSession.selectOne("mapper.room.selectRoomInfo", room_id);
	}
	
	
}
