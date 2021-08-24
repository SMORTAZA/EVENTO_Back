package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Servicee;

@Repository
public interface ServiceeRepository extends JpaRepository<Servicee, Long>{

}
