package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Adresse implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdresse;
	private String rue;
	private String ville;
	private int codePostal;
	private float latitude;
	private float longitude;
	private float altitude;
	
	@OneToMany(mappedBy = "adresse",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Evenement>evenements;
}
