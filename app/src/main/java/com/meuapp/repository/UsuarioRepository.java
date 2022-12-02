package com.meuapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
	
	List<UsuarioEntity> findByAtivo (Boolean ativo);
	Optional<UsuarioEntity> findByUsuario(String usuario);

}

