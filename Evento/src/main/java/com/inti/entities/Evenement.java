package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Evenement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEvenement;
	private String description;
	private float budget;
	private String categorie;
	private String nom;
	private Date dateDebut;
	private Date dateFin;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="Evenements_Catalogue",joinColumns =  @JoinColumn(name="idEvenement"),inverseJoinColumns=@JoinColumn(name="idCatalogue"))
	private List<Catalogue>catalogues;
	@ManyToOne
	@JoinColumn(name = "id_adresse",referencedColumnName = "idAdresse")
	private Adresse adresse;
	
	@ManyToMany(mappedBy = "evenements")
	private List<Utilisateur>utilisateurs;
}
