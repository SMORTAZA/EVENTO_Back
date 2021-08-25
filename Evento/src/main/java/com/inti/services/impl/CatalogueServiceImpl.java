package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Catalogue;
import com.inti.repositories.CatalogueRepository;
import com.inti.services.interfaces.CatalogueService;

public class CatalogueServiceImpl implements CatalogueService {

	@Autowired
	CatalogueRepository catalogueRepository;
	@Override
	public List<Catalogue> findAll() {
		// TODO Auto-generated method stub
		return catalogueRepository.findAll();
	}

	@Override
	public void deleteCatalogue(Long id) {
		// TODO Auto-generated method stub
		catalogueRepository.deleteById(id);
	}

	@Override
	public Catalogue saveCatalogue(Catalogue catalogue) {
		// TODO Auto-generated method stub
		return catalogueRepository.save(catalogue);
	}

	@Override
	public Catalogue findOne(Long id) {
		// TODO Auto-generated method stub
		return catalogueRepository.findById(id).get();
	}

}
