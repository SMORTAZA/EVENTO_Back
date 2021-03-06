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

import com.inti.entities.Evenement;
import com.inti.services.interfaces.EvenementService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionEvenements")
public class EvenementController {

	@Autowired
	EvenementService evenementService;

	@PostMapping("/evenement")
	public Evenement saveEvenement(@RequestBody(required = false) Evenement evenement) {
		return evenementService.saveEvenement(evenement);
	}

	@GetMapping("/evenement")
	public List<Evenement> findAll() {
		return evenementService.findAll();
	}

	@DeleteMapping("/evenement/{idEvenement}")
	public void deleteEvenement(@PathVariable("idEvenement") Long id) {
		evenementService.deleteEvenement(id);
	}

	@GetMapping("/evenement/{nom}")
	public List<Evenement> findOne(@PathVariable("nom") String nom) {
		List<Evenement> events = evenementService.findByName(nom);
		return events;
	}
	
	@GetMapping("/evenement/categorie/{categorie}")
	public List<Evenement> findByCategorie(@PathVariable("categorie") String categorie) {
		System.out.println(evenementService.findByCategorie(categorie));
		return evenementService.findByCategorie(categorie);
	}
}
