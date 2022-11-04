package com.spring.toy01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.toy01.dao.ReservationDAO;
import com.spring.toy01.dto.ReservationDTO;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationDAO resvDAO;
	
	@Override
	public int insertReservation(ReservationDTO rDTO) {
		return resvDAO.insertReservation(rDTO);
	}

	@Override
	public List thisMonthList() {
		return resvDAO.thisMonthList();
	}

}
