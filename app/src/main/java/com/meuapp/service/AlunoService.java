package com.meuapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.AlunoDto;
import com.meuapp.entity.AlunoEntity;
import com.meuapp.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired 
	AlunoRepository alunoRepository;
	
	public AlunoDto buscar (Integer id) {
		AlunoEntity alunoEntity = alunoRepository.findById(id).get();
		return mapper.map(alunoEntity, AlunoDto.class);
	}

	public AlunoDto salvar (AlunoDto aluno) {
		AlunoEntity alunoEntity = alunoRepository.save(mapper.map(aluno, AlunoEntity.class));
		return mapper.map(alunoEntity,AlunoDto.class);
	}
	
	public List<AlunoDto> getAllAlunos(){
		return alunoRepository.findAll()
				.stream()
				.map(a ->mapper.map(a, AlunoDto.class))
				.collect(Collectors.toList());
	}
	
	public List<AlunoDto> buscarAtivo(){
		return alunoRepository.findByAtivo(true)
				.stream()
				.map(t ->mapper.map(t, AlunoDto.class))
				.collect(Collectors.toList());
	}
	
	public AlunoDto buscarAluno (String nome) {
		Optional <AlunoEntity> alunoEntity = alunoRepository.findByNome(nome);
		if (alunoEntity.isPresent()){
			return mapper.map(alunoEntity.get(), AlunoDto.class);
		}else {
			throw new RuntimeException("O USUARIO NÃO EXISTE!!");
		}
	}
}
