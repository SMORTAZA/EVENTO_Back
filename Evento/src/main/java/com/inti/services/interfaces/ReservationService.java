package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Reservation;

public interface ReservationService {
	Reservation saveReservation(Reservation reservation);

	List<Reservation> findAll();

	Reservation findOne(Long id);

	void deleteReservation(Long id);
	
}
