package com.meuapp.controller;

import java.util.List;

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

import com.meuapp.dto.ProjetoDto;
import com.meuapp.service.ProjetoService;

@Controller
@RequestMapping ("Projeto")
public class ProjetoController {
	
	@Autowired
	ProjetoService projetoService;
	
	@ResponseBody
	@PostMapping ("/salvar")
	public ResponseEntity<?> salvarProjeto(@RequestBody ProjetoDto projeto){
		return new ResponseEntity<>(projetoService.salvar(projeto), HttpStatus.CREATED);
	}
	
	@ResponseBody
	@GetMapping("/buscar")
	public ProjetoDto buscarProjeto(@RequestParam Integer id) {
		return projetoService.buscar(id);
	}
	
	@ResponseBody
	@GetMapping("/buscarId")
	public List<ProjetoDto> buscarId(Integer id){
		return projetoService.buscarId(id);
	}
}
