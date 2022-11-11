package com.meuapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.dto.CarroDto;
import com.meuapp.entity.CarroEntity;
import com.meuapp.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	CarroRepository carroRepository;

	public CarroEntity salvar(CarroDto carro) {
		String modeloCarro = carro.getModeloCarro();
		String marcaCarro = carro.getMarcaCarro();
		String corCarro = carro.getCorCarro();
		Double valorCarro = carro.getValorCarro();
		Integer anoCarro = carro.getAnoCarro();

		CarroEntity objetoParaSalvar = new CarroEntity();
		objetoParaSalvar.setModeloCarro(modeloCarro);
		objetoParaSalvar.setMarcaCarro(marcaCarro);
		objetoParaSalvar.setCorCarro(corCarro);
		objetoParaSalvar.setValorCarro(valorCarro);
		objetoParaSalvar.setAnoCarro(anoCarro);
		return carroRepository.save(objetoParaSalvar);
	}
	
	public CarroDto buscar (String id) {
		CarroEntity carro = carroRepository.findById(Integer.valueOf(id)).get();
		CarroDto retorno = new CarroDto();
		retorno.setId(carro.getId());
		retorno.setModeloCarro(carro.getModeloCarro());
		retorno.setMarcaCarro(carro.getMarcaCarro());
		retorno.setCorCarro(carro.getCorCarro());
		retorno.setValorCarro(carro.getValorCarro());
		retorno.setAnoCarro(carro.getAnoCarro());
		
		return retorno;
	}

}
