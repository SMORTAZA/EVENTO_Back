package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation implements Serializable{
	private Long idReservation;
	private Date date;
	private Float CountFinal;
}
