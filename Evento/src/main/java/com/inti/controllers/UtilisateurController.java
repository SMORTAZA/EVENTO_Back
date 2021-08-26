package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.UtilisateurService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionUsers")
public class UtilisateurController {

	@Autowired
	UtilisateurService utilisateurService;

//	@Autowired
//	PasswordEncoder passwordEncoder;

	@PostMapping("/users")
	public Utilisateur saveUtilisateur(@RequestBody (required = false) Utilisateur utilisateur) {

		Utilisateur user = new Utilisateur();
//		user.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
		user.setUsername(utilisateur.getUsername());
		user.setNom(utilisateur.getNom());
		user.setPrenom(utilisateur.getPrenom());
		user.setRoles(utilisateur.getRoles());
		user.setDateNaissance(utilisateur.getDateNaissance());
		user.setMail(utilisateur.getMail());
		//// Atributs prestataire
		user.setContact(utilisateur.getContact());
		user.setNoteMoyenne(utilisateur.getNoteMoyenne());
		user.setDescription(utilisateur.getDescription());

		return utilisateurService.saveUtilisateur(utilisateur);
	}

	@GetMapping("/users")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Utilisateur findOne(@PathVariable("idUser") Long id) {
		return utilisateurService.findOne(id);
	}

	@DeleteMapping("/users/{idUser}")
	public void deleteUtilisateur(@PathVariable("idUser") Long id) {
		utilisateurService.deleteUtilisateur(id);
	}
	
	@PutMapping("/users/id")
	public Utilisateur updateUtilisateur(@PathVariable("id")Long idUtilisateur, Utilisateur utilisateur) {
		Utilisateur currentUser=utilisateurService.findOne(idUtilisateur);
		currentUser.setNom(utilisateur.getNom());
		currentUser.setPrenom(utilisateur.getPrenom());
		return utilisateurService.saveUtilisateur(currentUser);
	}

}
