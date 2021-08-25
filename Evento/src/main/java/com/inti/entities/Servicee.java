package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Servicee implements Serializable{
	
	private Long idService;
	private float tarif;
	private String description;
	@Lob
	private byte[] image;
	
	@OneToMany(mappedBy = "service")
	private List<Avis> avis;
	
	private List<Evenement> evenements;
	
}
