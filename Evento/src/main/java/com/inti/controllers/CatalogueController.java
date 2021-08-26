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

import com.inti.entities.Catalogue;
import com.inti.services.interfaces.CatalogueService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionCatalogues")
public class CatalogueController {

	@Autowired
	CatalogueService catalogueService;

	@PostMapping("/catalogue")
	public Catalogue saveCatalogue(@RequestBody (required = false) Catalogue catalogue) {
		return catalogueService.saveCatalogue(catalogue);
	}

	@GetMapping("/catalogue")
	public List<Catalogue> findAll() {
		return catalogueService.findAll();
	}

	@DeleteMapping("/catalogue/{idCatalogue}")
	public void deleteCatalogue(@PathVariable("idCatalogue") Long id) {
		catalogueService.deleteCatalogue(id);
	}

	@GetMapping("/catalogue/{idVoiture}")
	public Catalogue findOne(@PathVariable("idCatalogue") Long id) {
		return catalogueService.findOne(id);
	}
}
