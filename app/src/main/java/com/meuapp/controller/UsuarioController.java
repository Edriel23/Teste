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

import com.meuapp.dto.UsuarioDTO;
import com.meuapp.service.UsuarioService;

@Controller 
@RequestMapping ("Usuario")
public class UsuarioController {
	
	@Autowired 
	UsuarioService usuarioService;
	
	@ResponseBody
	@PostMapping("/salvar")
	public ResponseEntity<?> salvarUsuario (@RequestBody UsuarioDTO usuario) {
		return new ResponseEntity<>(usuarioService.salvar(usuario),HttpStatus.CREATED);
	}
	@ResponseBody
	@GetMapping ("/buscar")
	public UsuarioDTO buscarUsuario(@RequestParam Integer id) {
		return usuarioService.buscar(id);
	}
	
	@ResponseBody
	@GetMapping("/buscarTodos")
	public List<UsuarioDTO> getAllUsuarios() {
		return  usuarioService.getAllUsuarios();
	}
	
	@ResponseBody
	@GetMapping("/buscarAtivo")
	public List<UsuarioDTO> buscarAtivos () {
		return  usuarioService.buscarAtivos();
	}
	
	@ResponseBody
	@GetMapping ("/buscarUsuario")
	public ResponseEntity<?> buscarUsuarioNome( @RequestParam String usuario) {
		try {
			return new ResponseEntity<>(usuarioService.buscarUsuario(usuario),HttpStatus.OK);
		} catch (RuntimeException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}