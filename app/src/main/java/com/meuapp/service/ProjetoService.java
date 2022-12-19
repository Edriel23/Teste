package com.meuapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.ProjetoDto;
import com.meuapp.entity.ProjetoEntity;
import com.meuapp.repository.ProjetoRepository;

@Service
public class ProjetoService {
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	ProjetoRepository projetoRepository;
	
	public ProjetoDto salvar(ProjetoDto projeto) {
		ProjetoEntity projetoEntity = projetoRepository.save(mapper.map(projeto, ProjetoEntity.class));
		return mapper.map(projetoEntity, ProjetoDto.class);
	}
	
	public ProjetoDto buscar (Integer id) {
		ProjetoEntity projetoEntity = projetoRepository.findById(id).get();
		return mapper.map(projetoEntity, ProjetoDto.class);
	}

	public List<ProjetoDto> buscarId(Integer id){
		return projetoRepository.findByPessoaId(id)
				.stream()
				.map(o -> mapper.map(o, ProjetoDto.class))
				.collect(Collectors.toList());
		
		}
	}
