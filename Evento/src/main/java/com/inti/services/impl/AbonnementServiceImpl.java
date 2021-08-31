package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Abonnement;
import com.inti.repositories.AbonnementRepository;
import com.inti.services.interfaces.AbonnementService;

@Service
public class AbonnementServiceImpl implements AbonnementService {

	@Autowired
	AbonnementRepository abonnementRepository;

	@Override
	public List<Abonnement> findAll() {
		// TODO Auto-generated method stub
		return abonnementRepository.findAll();
	}

	@Override
	public void deleteAbonnement(Long id) {
		// TODO Auto-generated method stub
		abonnementRepository.deleteById(id);
	}

	@Override
	public Abonnement saveAbonnement(Abonnement abonnement) {
		// TODO Auto-generated method stub
		return abonnementRepository.save(abonnement);
	}

	@Override
	public List<Abonnement> findByName(String nom) {
		// TODO Auto-generated method stub
		return abonnementRepository.findByName(nom);
	}

}
