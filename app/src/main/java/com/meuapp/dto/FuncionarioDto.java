package com.meuapp.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioDto {
	private Integer Id;

	private String nomeFuncionario;
	private String cpfFuncionario;
	private String cargoFuncionario;
	private Double salarioFuncionario;
	private Date dataDeNacimento;
}