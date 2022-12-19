package com.meuapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.entity.ProjetoEntity;

@Repository

public interface ProjetoRepository extends JpaRepository<ProjetoEntity, Integer>{

	List<ProjetoEntity> findByPessoaId (Integer idPessoa);
}
