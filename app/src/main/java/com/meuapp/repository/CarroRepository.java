package com.meuapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.entity.CarroEntity;


@Repository
public interface CarroRepository extends JpaRepository<CarroEntity, Integer> {
	public  List<CarroEntity> findByAnoCarro (Integer anoCarro);

}
