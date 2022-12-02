package com.meuapp.service;



import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.FuncionarioDto;
import com.meuapp.entity.FuncionarioEntity;
import com.meuapp.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@Autowired
	ModelMapper mapper;
	
	public List<FuncionarioDto> getAllFuncionario(){
		return funcionarioRepository.findAll()
				.stream()
				.map(f -> mapper.map(f, FuncionarioDto.class))
				.collect(Collectors.toList());
	}

	public FuncionarioDto salvar(FuncionarioDto funcionario) {
		FuncionarioEntity funcionarioEnt = funcionarioRepository.save(mapper.map(funcionario, FuncionarioEntity.class));
		return mapper.map(funcionarioEnt, FuncionarioDto.class);
	}
	
	public FuncionarioDto buscar (Integer id) {
		FuncionarioEntity funcionario = funcionarioRepository.findById(id).get();
		return mapper.map(funcionario, FuncionarioDto.class);
	}
	

}
