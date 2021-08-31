package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Reservation;
import com.inti.repositories.ReservationRepository;
import com.inti.services.interfaces.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public Reservation saveReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

	@Override
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Long id) {
		return reservationRepository.findById(id).get();
	}

	@Override
	public void deleteReservation(Long id) {
		reservationRepository.deleteById(id);
	}

//	@Override
//	public void deleteReservationByIdEvenement(Long id) {
//		reservationRepository.deleteReservationByIdEvenement(id);
//	}

}
