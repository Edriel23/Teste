package com.meuapp.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProdutoDto {
	
	private Integer id;
	private String nome;
	private String marca;
	private Double valor;
	private LocalDate fabricacao;
	private LocalDate validade;

}
