package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Servicee;
import com.inti.repositories.ServiceeRepository;
import com.inti.services.interfaces.ServiceeService;

@Service
public class ServiceeServiceImpl implements ServiceeService{
	
	@Autowired
	ServiceeRepository serviceeRepository;

	@Override
	public Servicee saveService(Servicee service) {
		return serviceeRepository.save(service);
	}

	@Override
	public List<Servicee> findAll() {
		return serviceeRepository.findAll();
	}

	@Override
	public Servicee findOne(Long id) {
		return serviceeRepository.findById(id).get();
	}

	@Override
	public void deleteService(Long id) {
		serviceeRepository.deleteById(id);
	}

}
