package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Evenement;
import com.inti.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
//	@Query("DELETE FROM Reservation r where r.idEvenement =:id")
//	void deleteReservationByIdEvenement(Long id);
}
