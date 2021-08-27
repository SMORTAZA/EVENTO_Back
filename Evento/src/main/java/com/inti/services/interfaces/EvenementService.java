package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Evenement;

public interface EvenementService {

	public List<Evenement> findAll();
	
	public void deleteEvenement(Long id);
	
	public Evenement saveEvenement(Evenement evenement);
	
	public Evenement findOne(Long id);

}
