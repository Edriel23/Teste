create table pessoa(
id int auto_increment,
nome varchar(30),
primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


create table projeto(
id int auto_increment,
nome varchar(30),
primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


create table projeto_pessoa(
projeto_id int,
pessoa_id int,
foreign key(projeto_id) references projeto(id),
foreign key(pessoa_id) references pessoa(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;