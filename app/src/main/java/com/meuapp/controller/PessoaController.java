package com.meuapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meuapp.dto.PessoaDto;
import com.meuapp.service.PessoaService;

@Controller
@RequestMapping ("Pessoa")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	
	@ResponseBody
	@PostMapping ("/salvar")
	public ResponseEntity<?> salvarPessoa (@RequestBody PessoaDto pessoa){
		return new ResponseEntity<>(pessoaService.salvar(pessoa),HttpStatus.CREATED);
	}
	
	@ResponseBody
	@GetMapping ("/buscar")
	public PessoaDto buscarPessoa (@RequestParam Integer id) {
		return pessoaService.buscar(id);
	}
}
