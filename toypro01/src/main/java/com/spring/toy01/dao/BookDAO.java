package com.spring.toy01.dao;

import com.spring.toy01.dto.ReservationDTO;

public interface BookDAO {
	public int insertBook(ReservationDTO rDTO);
	
	public int selectBookInfoId();
}
