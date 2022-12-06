package com.meuapp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table (name = "Produto")
@Getter
@Setter
public class ProdutoEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	private String marca;
	private Double valor;
	private LocalDate fabricacao;
	private LocalDate validade;
	

}
