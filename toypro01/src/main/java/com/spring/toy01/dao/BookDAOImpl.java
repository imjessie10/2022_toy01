package com.spring.toy01.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.toy01.dto.ReservationDTO;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertBook(ReservationDTO rDTO) {
		return sqlSession.insert("mapper.book.insert", rDTO);
	}
	
	public int selectBookInfoId() {
		return sqlSession.selectOne("mapper.book.selectBookInfoId");
	}
}
