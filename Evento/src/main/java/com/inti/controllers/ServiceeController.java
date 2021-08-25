package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Servicee;
import com.inti.services.interfaces.ServiceeService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionServices")
public class ServiceeController {

	@Autowired
	ServiceeService reservationService;

	@PostMapping("/service")
	public Servicee saveEvenement(@RequestBody Servicee reservation) {
		return reservationService.saveService(reservation);
	}

	@GetMapping("/service")
	public List<Servicee> findAll() {
		return reservationService.findAll();
	}

	@DeleteMapping("/service/{idService}")
	public void deleteService(@PathVariable("idService") Long id) {
		reservationService.deleteService(id);
	}

	@GetMapping("/service/{idService}")
	public Servicee findOne(@PathVariable("idService") Long id) {
		return reservationService.findOne(id);
	}

}
