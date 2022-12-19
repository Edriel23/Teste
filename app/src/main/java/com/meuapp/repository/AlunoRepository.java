package com.meuapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.entity.AlunoEntity;


@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer> {
	
	List<AlunoEntity> findByAtivo (Boolean ativo);
	Optional<AlunoEntity> findByNome (String nome);
}
