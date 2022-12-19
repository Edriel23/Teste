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

import com.meuapp.dto.AlunoDto;
import com.meuapp.service.AlunoService;

@Controller
@RequestMapping (name = "Aluno")
public class AlunoController {
	
	@Autowired
	AlunoService alunoService;
	
	
	@ResponseBody
	@PostMapping("/salvar")
	public ResponseEntity<?> salvarAluno (@RequestBody AlunoDto aluno){
		return new ResponseEntity<>(alunoService.salvar(aluno),HttpStatus.CREATED);
	}
	
	@ResponseBody
	@GetMapping("/buscar")
	public AlunoDto buscarAluno (@RequestParam Integer id) {
		return alunoService.buscar(id);
	}
	
	@ResponseBody
	@GetMapping("/buscarTodos")
	public List<AlunoDto> getAllAluno(){
		return alunoService.getAllAlunos();
	}
	
	@ResponseBody
	@GetMapping("/buscarAtivo")
	public List<AlunoDto> buscarAtivo(){
		return alunoService.buscarAtivo();
	}
	
	@ResponseBody
	@GetMapping("/buscarAluno")
	public ResponseEntity<?> buscarNome (@RequestParam String nome){
		try {
			return new ResponseEntity<>(alunoService.buscarAluno(nome),HttpStatus.OK);
		}catch (RuntimeException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

}
