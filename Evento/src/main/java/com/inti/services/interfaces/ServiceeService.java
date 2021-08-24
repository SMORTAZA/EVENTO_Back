package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Servicee;

public interface ServiceeService {
	Servicee saveService(Servicee service);

	List<Servicee> findAll();

	Servicee findOne(Long id);

	void deleteService(Long id);
	
}
