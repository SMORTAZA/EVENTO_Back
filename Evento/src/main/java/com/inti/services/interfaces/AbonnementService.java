package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Abonnement;

public interface AbonnementService {

	public List<Abonnement> findAll();

	public void deleteAbonnement(Long id);

	public Abonnement saveAbonnement(Abonnement abonnement);

	public List<Abonnement> findByName(String nom);

}
