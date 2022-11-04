package com.spring.toy01.dao;

import java.util.List;

import com.spring.toy01.dto.ReservationDTO;

public interface ReservationDAO {
	public int insertReservation(ReservationDTO rDTO);
	public List thisMonthList();
}
