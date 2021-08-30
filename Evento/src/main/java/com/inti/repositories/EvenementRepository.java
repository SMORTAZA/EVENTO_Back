package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Evenement;
@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

	@Query("from Evenement e where e.nom like :x")
	public List<Evenement> findByName(@Param("x")String nom);
	
}
