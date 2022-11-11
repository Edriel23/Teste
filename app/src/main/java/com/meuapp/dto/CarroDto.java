package com.meuapp.dto;

public class CarroDto {
	
	private Integer id;
	private String modeloCarro;
	private String marcaCarro;
	private String corCarro;
	private Double valorCarro;
	private Integer anoCarro;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	public String getMarcaCarro() {
		return marcaCarro;
	}
	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}
	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	public double getValorCarro() {
		return valorCarro;
	}
	public void setValorCarro(Double valorCarro) {
		this.valorCarro = valorCarro;
	}
	public Integer getAnoCarro() {
		return anoCarro;
	}
	public void setAnoCarro(Integer anoCarro) {
		this.anoCarro = anoCarro;
	}
	

}
