package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date date;
	private Float CountFinal;
	
	
	@ManyToMany
	@JoinTable(name="Reservation_service",joinColumns =  @JoinColumn(name="idReservation"),inverseJoinColumns=@JoinColumn(name="idService"))
	private List<Servicee>services;
	@ManyToOne
	@JoinColumn(name = "id_evenement",referencedColumnName = "idEvenement")
	private Evenement evenement;
	
	
}
