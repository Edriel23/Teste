create table perfil (
id int not null auto_increment,
descricao varchar (30),
ativo boolean default true,
primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


insert into perfil (descricao) value 
('Admin'),
('Gerente');

create  table usuario (
id int not null auto_increment,
nome varchar (30),
nacimento date,
usuario varchar(30),
ativo boolean default true,
id_Perfil int,
primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


alter table usuario
add foreign key (id_Perfil)
references perfil(id);

insert into usuario values 
(default, 'Edril', '2001-07-23', 'EDRIEL', 1,1);