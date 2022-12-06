package com.meuapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.ProdutoDto;
import com.meuapp.entity.ProdutoEntity;
import com.meuapp.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired 
	ModelMapper mapper;
	
	@Autowired 
	ProdutoRepository produtoRepository;
	
	public List<ProdutoDto>getAllProduto(){
		return produtoRepository.findAll()
				.stream()
				.map(p -> mapper.map(p, ProdutoDto.class))
				.collect(Collectors.toList());
		
	}
	
	public ProdutoDto buscar (Integer id) {
		ProdutoEntity produtoEntity = produtoRepository.findById(id).get();
		return mapper.map(produtoEntity, ProdutoDto.class);
	}
	
	public ProdutoDto salvar (ProdutoDto produto) {
		ProdutoEntity produtoEntity = produtoRepository.save(mapper.map(produto, ProdutoEntity.class));
		return mapper.map(produtoEntity, ProdutoDto.class);
	}
	
	public ProdutoDto buscarUsuario (String produto) {
		Optional <ProdutoEntity> produtoEntity = produtoRepository.findByNome(produto);
		if (produtoEntity.isPresent()){
			return mapper.map(produtoEntity.get(), ProdutoDto.class);
		}else {
			throw new RuntimeException("O USUARIO NÃO EXISTE!!");
		}
	}

}
