package com.meuapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.meuapp.entity.PerfilEntity;

@Repository
public interface GraduacaoRepository extends JpaRepository<PerfilEntity, Integer> {

}
