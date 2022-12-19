
create table cursos(
id int auto_increment,
nome varchar(50),
hora int,
ativo boolean default true,
primary key(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


create table aluno(
id int auto_increment,
nome varchar(50),
nacimento date,
cpf varchar(30),
ativo boolean default true,
primary key(id),
id_Curso int,
foreign key (id_Curso) references cursos(id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

