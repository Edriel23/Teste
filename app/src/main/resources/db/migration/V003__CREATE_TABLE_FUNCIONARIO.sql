CREATE TABLE Funcionario(
	
	id IDENTITY PRIMARY KEY,
	nome_funcionario varchar (50),
	cpf_funcionario varchar (11),
	cargo_funcionario varchar (11),
	salario_funcionario double ,
	data_de_nacimento date
	
);