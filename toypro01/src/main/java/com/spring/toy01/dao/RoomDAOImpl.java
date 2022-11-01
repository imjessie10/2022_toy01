package com.spring.toy01.dao;

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
	
}
