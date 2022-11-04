package com.spring.toy01.service;

import java.util.List;

import com.spring.toy01.dto.ReservationDTO;

public interface ReservationService {
	public int insertReservation(ReservationDTO rDTO);
	public List thisMonthList();
}
