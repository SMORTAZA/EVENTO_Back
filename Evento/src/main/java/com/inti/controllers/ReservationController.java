package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Reservation;
import com.inti.services.interfaces.ReservationService;

@RestController
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@PostMapping("/reservation")
    public Reservation saveEvenement(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/reservation")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @DeleteMapping("/reservation/{idReservation}")
    public void deleteReservation(@PathVariable("idReservation") Long id) {
    	reservationService.deleteReservation(id);
    }

    @GetMapping("/reservation/{idReservation}")
	public Reservation findOne(@PathVariable("idReservation") Long id) {
		return reservationService.findOne(id);
	}

}
