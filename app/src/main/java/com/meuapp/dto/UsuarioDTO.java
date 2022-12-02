package com.meuapp.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UsuarioDTO {
	private Integer id;
	
	private String nomeUsuario;
	private String usuario;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate nacimentoUsuario;
	private Boolean ativo;
	private PerfilDto perfil;
}
