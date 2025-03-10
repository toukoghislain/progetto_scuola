package com.robotokeys.db_esercizio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="classi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique= true, length =50)
	private String nome;

	@Column(columnDefinition = "TEXT")
	private String descrizione;



}

