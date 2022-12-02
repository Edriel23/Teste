CREATE TABLE Funcionario(
	
	id int auto_increment,
	nome_funcionario varchar (50),
	cpf_funcionario varchar (11),
	cargo_funcionario varchar (11),
	salario_funcionario double ,
	data_de_nacimento date,
	primary key (id)
	
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;