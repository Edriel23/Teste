package com.meuapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.PessoaDto;
import com.meuapp.entity.PessoaEntity;
import com.meuapp.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	
	public PessoaDto salvar (PessoaDto pessoa) {
		PessoaEntity pessoaEntity = pessoaRepository.save(mapper.map(pessoa, PessoaEntity.class));
		return mapper.map(pessoaEntity, PessoaDto.class);
	}
	
	public PessoaDto buscar (Integer id) {
		PessoaEntity pessoaEntity = pessoaRepository.findById(id).get();
		return mapper.map(pessoaEntity, PessoaDto.class);
		
	}

}
