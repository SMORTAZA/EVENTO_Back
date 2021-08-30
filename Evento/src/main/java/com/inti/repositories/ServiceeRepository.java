package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Servicee;

@Repository
public interface ServiceeRepository extends JpaRepository<Servicee, Long>{

	@Query("from Servicee where fk_prestataire like :x")
	public List<Servicee> findAllByIdUser(@Param("x")Long idUser);
	
}
