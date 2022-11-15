CREATE TABLE aluno (
    nome varchar (150) not null,
    num_tel varchar (30) not null,
    cpf varchar (20) not null,
    senha varchar (20) not null,
    matricula int primary key
);

CREATE TABLE funcionario (
    nome varchar (150) not null,
    cpf varchar (20) not null,
    senha varchar (20) not null,
    id_funcio int primary key,
    id_vel int
);

CREATE TABLE horario (
    numero int primary key,
    hr_ida varchar (10),
    hr_volta varchar (10),
    dt_viagem date not null
);

CREATE TABLE horario_aluno (
    numero_viagem int,
    matricula_aluno int,
    foreign key (numero_viagem) references horario (numero),
    foreign key (matricula_aluno) references aluno (matricula)
);

CREATE TABLE veiculo (
    ano int not null,
    modelo varchar (15) not null,
    chassi varchar (30) not null,
    placa varchar (20) not null,
    id_vel int primary key
);

CREATE TABLE vagas (
    vagas int not null,
    id_vel int,
    foreign key (id_vel) references veiculo (id_vel)
);

CREATE TABLE pagamento (
    mes_pago varchar (20) not null,
    matricula_aluno int,
    dia_pago varchar (20) not null,
    FOREIGN KEY (matricula_aluno) REFERENCES aluno (matricula)
);

CREATE TABLE troca_veiculo (
	motivo varchar (300) not null,
	id_vel_antigo int,
	id_vel_novo int,
	foreign key (id_vel_antigo) references veiculo (id_vel),
	foreign key (id_vel_novo) references veiculo (id_vel)
);