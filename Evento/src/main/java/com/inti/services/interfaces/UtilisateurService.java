package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Utilisateur;

public interface UtilisateurService {
	Utilisateur saveUtilisateur(Utilisateur utilisateur);

	List<Utilisateur> findAll();

	Utilisateur findOne(Long id);

	void deleteUtilisateur(Long id);
	
	Utilisateur findByUsername(String username);
}