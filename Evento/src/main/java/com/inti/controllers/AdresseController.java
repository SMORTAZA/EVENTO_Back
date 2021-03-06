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

import com.inti.entities.Adresse;
import com.inti.services.interfaces.AdresseService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionAdresses")
public class AdresseController {

	@Autowired
	AdresseService adresseService;
	
	@PostMapping("/adresse")
    public Adresse saveAdresse(@RequestBody (required = false) Adresse adresse) {
        return adresseService.saveAdresse(adresse);
    }

    @GetMapping("/adresse")
    public List<Adresse> findAll() {
        return adresseService.findAll();
    }

    @DeleteMapping("/adresse/{idAdresse}")
    public void deleteAdresse(@PathVariable("idAdresse") Long id) {
        adresseService.deleteAdresse(id);
    }

    @GetMapping("/adresse/{idAdresse}")
	public Adresse findOne(@PathVariable("idAdresse") Long id) {
		return adresseService.findOne(id);
	}
}
