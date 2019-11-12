package com.fatec.scel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import org.hibernate.annotations.NaturalId;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NaturalId
	@Column(nullable = false, length = 13)
	@NotEmpty(message = "O RA deve ser preenchido") // o atributo nao pode ser nulo e o tamanho > zero
	private String ra;
	@Column(nullable = false, length = 100)
	@NotEmpty(message = "O nome deve ser preenchido")
	private String nome;
	@Column(nullable = false)
	@NotNull(message = "email invalido")
	private String email;

		public Aluno() {
			
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getRa() {
			return ra;
		}
		public void setRa(String ra) {
			this.ra = ra;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
}
