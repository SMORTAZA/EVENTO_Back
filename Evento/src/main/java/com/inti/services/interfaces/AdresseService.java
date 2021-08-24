package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Adresse;

public interface AdresseService {

	public List<Adresse> findAll();
	
	public void deleteAdresse(Long id);
	
	public Adresse saveAdresse(Adresse adresse);
	
	public Adresse findOne(Long id);
}
