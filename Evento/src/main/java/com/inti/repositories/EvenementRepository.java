package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Evenement;
@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

}
