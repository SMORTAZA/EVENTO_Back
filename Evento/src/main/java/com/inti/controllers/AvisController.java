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

import com.inti.entities.Avis;
import com.inti.services.interfaces.AvisService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionAvis")
public class AvisController {

	@Autowired
	AvisService avisService;

	@PostMapping("/avis")
	public Avis saveEvenement(@RequestBody (required = false) Avis avis) {
		return avisService.saveAvis(avis);
	}

	@GetMapping("/avis")
	public List<Avis> findAll() {
		return avisService.findAll();
	}

	@DeleteMapping("/avis/{idAvis}")
	public void deleteAvis(@PathVariable("idAvis") Long id) {
		avisService.deleteAvis(id);
	}

	@GetMapping("/avis/{idAvis}")
	public Avis findOne(@PathVariable("idAvis") Long id) {
		return avisService.findOne(id);
	}
}
