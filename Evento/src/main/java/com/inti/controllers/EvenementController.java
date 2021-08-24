package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Evenement;
import com.inti.services.interfaces.EvenementService;

@RestController
public class EvenementController {

	@Autowired
	EvenementService evenementService;
	
	@PostMapping("/evenement")
    public Evenement saveEvenement(@RequestBody Evenement evenement) {
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

    @GetMapping("/evenement/{idVoiture}")
	public Evenement findOne(@PathVariable("idEvenement") Long id) {
		return evenementService.findOne(id);
	}
}
