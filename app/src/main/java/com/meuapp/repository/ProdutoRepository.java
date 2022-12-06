package com.meuapp.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.meuapp.entity.ProdutoEntity;



@Repository
public interface  ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {
	
	Optional<ProdutoEntity> findByNome(String nome);

}
