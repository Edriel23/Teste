package com.meuapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.UsuarioDTO;
import com.meuapp.entity.UsuarioEntity;
import com.meuapp.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<UsuarioDTO> getAllUsuarios() {
		return usuarioRepository.findAll()
				.stream()
				.map(o -> mapper.map(o, UsuarioDTO.class))
				.collect(Collectors.toList());
	}
	
	public UsuarioDTO buscar (Integer id) {
		UsuarioEntity usuarioEntity =  usuarioRepository.findById(id).get();
		return  mapper.map(usuarioEntity, UsuarioDTO.class);
		
	}
	public UsuarioDTO salvar (UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = usuarioRepository.save(mapper.map(usuario, UsuarioEntity.class ));
		return mapper.map(usuarioEntity, UsuarioDTO.class);
	}
	
	public List<UsuarioDTO> buscarAtivos () {
		return usuarioRepository.findByAtivo(true)
			.stream()
			.map(o -> mapper.map(o, UsuarioDTO.class))
			.collect(Collectors.toList());
	}
	
	public UsuarioDTO buscarUsuario (String usuario) {
		Optional <UsuarioEntity> usuarioEntity = usuarioRepository.findByUsuario(usuario);
		if (usuarioEntity.isPresent()){
			return mapper.map(usuarioEntity.get(), UsuarioDTO.class);
		}else {
			throw new RuntimeException("O USUARIO NÃO EXISTE!!");
		}
	}
	
}
