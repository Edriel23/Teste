package com.meuapp.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "Aluno")
@Getter
@Setter
public class AlunoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private LocalDate nacimento;
	private String cpf;
	private Boolean ativo;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH )
	@JoinColumn(name = "id_Curso")
	private GraduacaoEntity curso;
}
