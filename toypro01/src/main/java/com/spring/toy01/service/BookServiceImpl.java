package com.spring.toy01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.toy01.dao.BookDAO;
import com.spring.toy01.dto.ReservationDTO;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public int insertBook(ReservationDTO rDTO) {
		return bookDAO.insertBook(rDTO);
	}

	@Override
	public int selectBookInfoId() {
		return bookDAO.selectBookInfoId();
	}

}
