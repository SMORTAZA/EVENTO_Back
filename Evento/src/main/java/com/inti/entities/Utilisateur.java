package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor

//JPA
@Entity
public class Utilisateur implements Serializable {

	/**
	 * Attributs utilisateur
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nom;
	private String prenom;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", joinColumns = {
			@JoinColumn(name = "id_utilisateur", referencedColumnName = "idUtilisateur") }, inverseJoinColumns = {
					@JoinColumn(name = "id_role", table = "role", referencedColumnName = "idRole") })
	private Set<Role> roles = new HashSet<Role>();
	private boolean enabled = true;
	@Column(unique = true)
	private String username;
	private String password;
	private String status;
	private Date dateNaissance;
	private String mail;
	//// Attributs "Prestataire"
	private float noteMoyenne;
	private String description;
	private String contact;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@JoinColumn(name="FK_ABONNEMENT", referencedColumnName = "idAbonnement")
	private Abonnement abonnement;

}
