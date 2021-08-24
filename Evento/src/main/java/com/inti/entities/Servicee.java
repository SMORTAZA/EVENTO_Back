package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Lob;

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
}
