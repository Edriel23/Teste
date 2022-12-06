package com.meuapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meuapp.dto.ProdutoDto;
import com.meuapp.service.ProdutoService;



@Controller
@RequestMapping ("Produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@ResponseBody
	@PostMapping ("/salvar")
	public ResponseEntity<?> salvarProduto(@RequestParam ProdutoDto produto) {
		return new ResponseEntity<>(produtoService.salvar(produto),HttpStatus.CREATED);
	}
	
	@ResponseBody
	@GetMapping("/buscar")
	public ProdutoDto buscarProduto (@RequestParam Integer id) {
		return produtoService.buscar(id);
	}

	@ResponseBody 
	@GetMapping ("/buscarTodosProdutos")
	public List<ProdutoDto>getAllProduto() {
		return produtoService.getAllProduto();
	}
	
	@ResponseBody
	@GetMapping ("/buscarProduto")
	public ResponseEntity<?> buscarProdutoNome( @RequestParam String produto) {
		try {
			return new ResponseEntity<>(produtoService.buscarUsuario(produto),HttpStatus.OK);
		} catch (RuntimeException p) {
			return new ResponseEntity<>(p.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}
