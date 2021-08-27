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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Servicee;
import com.inti.services.interfaces.ServiceeService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionServices")
public class ServiceeController {

	@Autowired
	ServiceeService reservationService;

	@PostMapping("/service")
	public Servicee saveService(@RequestBody (required = false) Servicee reservation) {
		return reservationService.saveService(reservation);
	}
	
	@PostMapping("/service")
	public String saveServiceImage(@RequestParam("tarif") float tarif, @RequestParam("description") String description,
			@RequestParam("file") MultipartFile file) {
		try {
			Servicee currentService = new Servicee();
			currentService.setTarif(tarif);
			currentService.setDescription(description);
			currentService.setImage(file.getBytes());
			reservationService.saveService(currentService);
			return "File uploaded successfully! filename = " + file.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail! maybe you had uploaded the file before or the file's size > 500kB";
		}
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
