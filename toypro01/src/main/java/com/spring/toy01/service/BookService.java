package com.spring.toy01.service;

import com.spring.toy01.dto.ReservationDTO;

public interface BookService {
	public int insertBook(ReservationDTO rDTO);
	
	public int selectBookInfoId();
}
