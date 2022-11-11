package com.meuapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.ClienteDTO;
import com.meuapp.entity.ClienteEntity;
import com.meuapp.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public ClienteEntity salvar(ClienteDTO cliente) {
		String nome = cliente.getNome();
		String cpf = cliente.getCpf();
		
		
		ClienteEntity objetoParaSalvar = new ClienteEntity();
		objetoParaSalvar.setNome(nome);
		objetoParaSalvar.setCpf(cpf);
		return clienteRepository.save(objetoParaSalvar);
		
	}
	
	public ClienteDTO buscar(String id) {
		ClienteEntity cliente = clienteRepository.findById(Integer.valueOf(id)).get();
		
		ClienteDTO retorno = new ClienteDTO();
		retorno.setId(cliente.getId());
		retorno.setCpf(cliente.getCpf());
		retorno.setNome(cliente.getNome());
		
		return retorno;
		
		
	}
	
}
