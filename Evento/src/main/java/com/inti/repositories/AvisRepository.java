package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.inti.entities.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long>{

	@Query("from Avis a where a.note like :x")
	public List<Avis> findByNote(@Param("x")int note);
}
