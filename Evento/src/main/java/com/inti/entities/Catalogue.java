package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Catalogue implements Serializable {

	private Long id;
	
	@ManyToMany(mappedBy = "catalogues")
	private List<Evenement> evenements;
}
