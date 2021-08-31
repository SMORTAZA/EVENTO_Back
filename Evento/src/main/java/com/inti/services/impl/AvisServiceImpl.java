package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Avis;
import com.inti.repositories.AvisRepository;
import com.inti.services.interfaces.AvisService;

@Service
public class AvisServiceImpl implements AvisService{
	
	@Autowired
	AvisRepository avisRepository;

	@Override
	public Avis saveAvis(Avis avis) {
		return avisRepository.save(avis);
	}

	@Override
	public List<Avis> findAll() {
		return avisRepository.findAll();
	}

	@Override
	public Avis findOne(Long id) {
		return avisRepository.findById(id).get();
	}

	@Override
	public void deleteAvis(Long id) {
		avisRepository.deleteById(id);
	}

	@Override
	public List<Avis> findByNote(int note) {
		// TODO Auto-generated method stub
		return avisRepository.findByNote(note);
	}

}
