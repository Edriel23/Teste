package com.meuapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.entity.PessoaEntity;


@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {

}
