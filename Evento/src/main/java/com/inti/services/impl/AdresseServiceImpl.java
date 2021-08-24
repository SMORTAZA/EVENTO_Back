package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.inti.entities.Adresse;
import com.inti.repositories.AdresseRepository;
import com.inti.services.interfaces.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService{

	@Autowired
	AdresseRepository adresseRepository;
	
	@Override
	public List<Adresse> findAll() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll(); 
	}

	@Override
	public void deleteAdresse(Long id) {
		// TODO Auto-generated method stub
		adresseRepository.deleteById(id);
	}

	@Override
	public Adresse saveAdresse(Adresse adresse) {
		// TODO Auto-generated method stub
		return adresseRepository.save(adresse);
	}

	@Override
	public Adresse findOne(Long id) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(id).get();
	}

}
