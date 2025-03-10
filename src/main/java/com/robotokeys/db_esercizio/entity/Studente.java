package com.robotokeys.db_esercizio.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="studenti")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length =50)
	private String nome;

	@Column(nullable = false, length =50)
	private String cognome;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Genere genere;

	@Column(nullable = false)
	private int eta;

	@ManyToOne
	@JoinColumn(name = "classe_id", referencedColumnName = "id")
	private Classe classe;

	@ManyToOne
	@JoinColumn(name ="hobby_id", referencedColumnName= "id")
	private Hobby hobby;



}
