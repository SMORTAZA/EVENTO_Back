package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Servicee;
import com.inti.services.interfaces.ServiceeService;
import com.inti.services.interfaces.UtilisateurService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionServices")
public class ServiceeController {

	@Autowired
	ServiceeService serviceeService;
	@Autowired
	UtilisateurService utilisateurService;

	@PostMapping("/service")
	public Servicee saveService(@RequestBody (required = false) Servicee reservation) {
		return serviceeService.saveService(reservation);
	}
	
	@PostMapping("/serviceimg")
	public String saveServiceImage(@RequestParam("tarif") float tarif, @RequestParam("description") String description, @RequestParam("prestataire") Long idPrestataire,
			@RequestParam("file") MultipartFile file) {
		try {
			Servicee currentService = new Servicee();
			currentService.setTarif(tarif);
			currentService.setDescription(description);
			currentService.setImage(file.getBytes());
			currentService.setPrestataire(utilisateurService.findOne(idPrestataire));
			serviceeService.saveService(currentService);
			return "File uploaded successfully! filename = " + file.getOriginalFilename();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Fail! maybe you had uploaded the file before or the file's size > 500kB";
		}
	}

	@GetMapping("/service")
	public List<Servicee> findAll() {
		return serviceeService.findAll();
	}

	@DeleteMapping("/service/{idService}")
	public void deleteService(@PathVariable("idService") Long id) {
		serviceeService.deleteService(id);
	}

	@GetMapping("/service/{idService}")
	public Servicee findOne(@PathVariable("idService") Long id) {
		return serviceeService.findOne(id);
	}
	@GetMapping("/service/user/{idUser}")
	public List<Servicee> findOffreByIdUser(@PathVariable("idUser") Long id) {
		return serviceeService.findAllServicesByUserId(id);
	}
	
	@PutMapping("/service/{id}")
	public Servicee updateServicee(@PathVariable("id") Long idServicee, @RequestBody Servicee servicee) {
		Servicee currentServicee = serviceeService.findOne(idServicee);
		currentServicee.setDescription(servicee.getDescription());
		currentServicee.setTarif(servicee.getTarif());
		currentServicee.setImage(servicee.getImage());
		return serviceeService.saveService(currentServicee);
	}

}
