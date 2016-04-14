use projeto;

create table cliente(
	id_cliente int primary key auto_increment not null,
    nome_cliente char(100) not null,
    endereco_cliente char(200) not null,
    cpf_cliente int(11) not null,
    telefone_cliente int(20) not null,
    login_cliente varchar(50) not null,
    senha_cliente varchar(50) not null,
    id_pagamento int not null,
	constraint fk_id_pagamento foreign key pagamento(id_pagamento) references pagamento(id_pagamento)
);
alter table cliente add id_pagamento int not null;
alter table cliente add	constraint fk_id_pagamento foreign key pagamento(id_pagamento) references pagamento(id_pagamento);

create table filmes(
	id_filme int not null auto_increment,
	nome_filme char(50) not null,
    sinopse_filme char not null,
    id_cliente int not null,
    preco_filme float not null,
    primary key(id_filme),
    categoria_filme char(30) not null,
	constraint fk_id_cliente foreign key cliente(id_cliente) references cliente(id_cliente)
);

create table categoria(
	comedia	char,
    terror char,
    acao char,
    aventura char,
    drama char,
    romance char,
    id_filme int not null,
    constraint fk_id_filme foreign key filmes(id_filme) references filmes(id_filme)
    
);

create table pagamento(
	id_pagamento int not null auto_increment,
    numero_cartao int(16) not null,
    codigo_verificacao int(6) not null,
    forma_pagamento char(15) not null,
    bandeira_cartao char(30) not null,
    agencia_cartao varchar(40) not null,
    conta_cartao varchar(25) not null,
    primary key (id_pagamento)    
);

select * from cliente;