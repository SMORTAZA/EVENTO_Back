package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Catalogue;

public interface CatalogueService {

    public List<Catalogue> findAll();
	
	public void deleteCatalogue(Long id);
	
	public Catalogue saveCatalogue(Catalogue catalogue);
	
	public Catalogue findOne(Long id);
}
