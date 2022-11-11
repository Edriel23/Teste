package com.meuapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meuapp.dto.CarroDto;
import com.meuapp.entity.CarroEntity;
import com.meuapp.service.CarroService;

@Controller
@RequestMapping("carro")
public class CarroController {
	
	@Autowired
	CarroService carroService;
	
	@ResponseBody
	@PostMapping("/salvar")
	public CarroEntity salvarCarro (@RequestBody CarroDto Carro) {
		return carroService.salvar (Carro);
	}
	
	@ResponseBody
	@GetMapping("/buscar")
	public CarroDto buscarCliente(@RequestParam String id) {
		return carroService.buscar(id);
	}
}
