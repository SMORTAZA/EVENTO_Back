package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Servicee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idService;
	private float tarif;
	private String description;
	@Lob
	private byte[] image;
	@OneToMany(mappedBy = "service")
	private List<Avis> avis;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "FK_PRESTATAIRE", referencedColumnName="idUtilisateur")
	private Utilisateur prestataire;
	
	
	
}
