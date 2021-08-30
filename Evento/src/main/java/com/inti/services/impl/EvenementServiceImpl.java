package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Evenement;
import com.inti.repositories.EvenementRepository;
import com.inti.services.interfaces.EvenementService;

@Service
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	EvenementRepository evenementRepository;
	@Override
	public List<Evenement> findAll() {
		// TODO Auto-generated method stub
		return evenementRepository.findAll();
	}

	@Override
	public void deleteEvenement(Long id) {
		// TODO Auto-generated method stub
		evenementRepository.deleteById(id);
	}

	@Override
	public Evenement saveEvenement(Evenement evenement) {
		// TODO Auto-generated method stub
		return evenementRepository.save(evenement);
	}

	@Override
	public List<Evenement> findByName(String nom) {
		// TODO Auto-generated method stub
		return evenementRepository.findByName(nom);
	}

}
