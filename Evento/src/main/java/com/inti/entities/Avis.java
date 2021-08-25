package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Avis implements Serializable{
	private Long idAvis;
	private String commentaire;
	private int note;
	
	@OneToOne
	private Servicee service;
}
