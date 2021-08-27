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
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Abonnement;
import com.inti.services.interfaces.AbonnementService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionAbonnements")
public class AbonnementController {

	@Autowired
	AbonnementService abonnementService;

	@PostMapping("/abonnement")
	public Abonnement saveAbonnement(@RequestBody(required = false) Abonnement abonnement) {
		return abonnementService.saveAbonnement(abonnement);
	}

	@GetMapping("/abonnement")
	public List<Abonnement> findAll() {
		return abonnementService.findAll();
	}

	@DeleteMapping("/abonnement/{idAbonnement}")
	public void deleteAbonnement(@PathVariable("idAbonnement") Long id) {
		abonnementService.deleteAbonnement(id);
	}

	@GetMapping("/abonnement/{idAbonnement}")
	public Abonnement findOne(@PathVariable("idAbonnement") Long id) {
		return abonnementService.findOne(id);
	}
	
	@PutMapping("/abonnement/{idAbonnement}")
	public Abonnement updateUtilisateur(@PathVariable("idAbonnement") Long id, @RequestBody Abonnement abonnement) {
		Abonnement currentAbonnement = abonnementService.findOne(id);
		currentAbonnement.setNom(abonnement.getNom());
		currentAbonnement.setTarif(abonnement.getTarif());
		currentAbonnement.setDateDebut(abonnement.getDateDebut());
		currentAbonnement.setDateFin(abonnement.getDateFin());
		return abonnementService.saveAbonnement(currentAbonnement);
	}
}
