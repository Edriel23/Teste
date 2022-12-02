package com.meuapp.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Usuario")
public class UsuarioEntity {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nomeUsuario;
	private String usuario;
	@Column(name = "nacimento")
	private LocalDate nacimentoUsuario;
	private Boolean ativo;
	
	@ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.DETACH)
	@JoinColumn (name= "id_Perfil")
	private PerfilEntity perfil;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public PerfilEntity getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilEntity perfil) {
		this.perfil = perfil;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public LocalDate getNacimentoUsuario() {
		return nacimentoUsuario;
	}
	public void setNacimentoUsuario(LocalDate nacimentoUsuario) {
		this.nacimentoUsuario = nacimentoUsuario;
	}
	public Boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
