package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Avis;

public interface AvisService {
	Avis saveAvis(Avis avis);

	List<Avis> findAll();

	Avis findOne(Long id);

	void deleteAvis(Long id);
	
	List<Avis> findByNote(int note);
	
}
