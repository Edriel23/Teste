package com.meuapp.entity;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table (name = "projeto")
@Data
public class ProjetoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	
	@ManyToMany
	@JoinTable(name = "projeto_pessoa",
			joinColumns = @JoinColumn(name = "projeto_id"),
			inverseJoinColumns = @JoinColumn (name = "pessoa_id"))
	List<PessoaEntity> pessoa;

}
