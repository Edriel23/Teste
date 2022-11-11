package com.meuapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meuapp.dto.ClienteDTO;
import com.meuapp.entity.ClienteEntity;
import com.meuapp.service.ClienteService;

@Controller
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@ResponseBody
	@PostMapping("/salvar")
	public ClienteEntity salvarCliente(@RequestBody ClienteDTO cliente) {
		return clienteService.salvar(cliente);
	}
	
	@ResponseBody
	@GetMapping("/buscar")
	public ClienteDTO buscarCliente(@RequestParam String id) {
		return clienteService.buscar(id);
	}
}
