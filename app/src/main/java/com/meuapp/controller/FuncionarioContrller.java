package com.meuapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meuapp.dto.FuncionarioDto;
import com.meuapp.entity.FuncionarioEntity;
import com.meuapp.service.FuncionarioService;

@Controller
@RequestMapping("funcionario")
public class FuncionarioContrller {
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@ResponseBody
	@PostMapping("/salvar")
	public FuncionarioEntity salvarFuncionario (@RequestBody FuncionarioDto Funcionario) {
		return funcionarioService.salvar(Funcionario);
	}
	@ResponseBody
	@GetMapping("/buscar")
	public FuncionarioDto buscarCliente(@RequestParam String id) {
		return funcionarioService.buscar(id);
	}
}
