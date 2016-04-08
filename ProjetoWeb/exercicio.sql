create database exercicio;
use exercicio;

create table cliente(
	id_cliente int not null primary key,
    nome char(30) not null,
    fone int(9) not null
);
