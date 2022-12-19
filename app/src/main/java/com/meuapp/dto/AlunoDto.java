package com.meuapp.dto;

import java.time.LocalDate;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoDto {
	
	private Integer id;
	
	private String nome;
	private LocalDate nacimento;
	private String cpf;
	private Boolean ativo;
	private GraduacaoDto curso;
}
