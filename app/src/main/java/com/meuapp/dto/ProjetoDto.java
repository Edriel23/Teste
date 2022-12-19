package com.meuapp.dto;

import java.util.List;

import com.meuapp.entity.PessoaEntity;

import lombok.Data;

@Data
public class ProjetoDto {
	
	private Integer id;
	private String nome;
	
	private List<PessoaEntity> pessoa;
	
}
