package com.meuapp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.FuncionarioDto;
import com.meuapp.entity.FuncionarioEntity;
import com.meuapp.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository funcionarioRepository;

	public FuncionarioEntity salvar(FuncionarioDto funcionario) {
		
	String nomeFunconario = funcionario.getNomeFunconario();
	String cpfFuncionario = funcionario.getCpfFuncionario();
	String cargoFuncioario = funcionario.getCargoFuncionario();
	Double salarioFuncioanario = funcionario.getSalarioFuncionario();
	Date dataDeNacimento = funcionario.getDataDeNacimento();
	
	FuncionarioEntity objetoParaSalvar = new FuncionarioEntity();
	objetoParaSalvar.setNomeFunconario(nomeFunconario);
	objetoParaSalvar.setCpfFuncionario(cpfFuncionario);
	objetoParaSalvar.setCargoFuncionario(cargoFuncioario);
	objetoParaSalvar.setSalarioFuncionario(salarioFuncioanario);
	objetoParaSalvar.setDataDeNacimento(dataDeNacimento);
	return funcionarioRepository.save(objetoParaSalvar);
	
	
	}
	
	public FuncionarioDto buscar (String id) {
		FuncionarioEntity funcionario = funcionarioRepository.findById(Integer.valueOf(id)).get();
		FuncionarioDto retorno = new FuncionarioDto();
		retorno.setId(funcionario.getId());
		retorno.setNomeFunconario(funcionario.getNomeFunconario());
		retorno.setCpfFuncionario(funcionario.getCpfFuncionario());
		retorno.setCargoFuncionario(funcionario.getCargoFuncionario());
		retorno.setSalarioFuncionario(funcionario.getSalarioFuncionario());
		retorno.setDataDeNacimento(funcionario.getDataDeNacimento());
		
		return retorno;
	
		
	}
	

}
