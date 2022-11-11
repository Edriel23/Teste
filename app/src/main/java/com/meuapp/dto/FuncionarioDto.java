package com.meuapp.dto;

import java.util.Date;

public class FuncionarioDto {
	private Integer Id;

	private String nomeFunconario;
	private String cpfFuncionario;
	private String cargoFuncionario;
	private Double salarioFuncionario;
	private Date dataDeNacimento;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNomeFunconario() {
		return nomeFunconario;
	}
	public void setNomeFunconario(String nomeFunconario) {
		this.nomeFunconario = nomeFunconario;
	}
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	public Date getDataDeNacimento() {
		return dataDeNacimento;
	}
	public void setDataDeNacimento(Date dataDeNacimento) {
		this.dataDeNacimento = dataDeNacimento;
	}

}
