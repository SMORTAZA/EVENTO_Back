package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long>{

	@Query("from Abonnement a where a.nom like :x")
	public List<Abonnement> findByName(@Param("x")String nom);
}
