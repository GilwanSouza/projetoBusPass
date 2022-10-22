CREATE TABLE aluno (
    nome varchar (150),
    num_tel varchar (30),
    cpf varchar (20),
    senha vachar (20),
    matricula int primary key
);

CREATE TABLE funcionario (
    nome varchar (150),
    cpf varchar (20),
    senha varchar (20),
    id_vel int primary key
);

CREATE TABLE horario (
    numero int primary key,
    hr_ida varchar (10),
    hr_volta varchar (10),
    dt_viagem date
);

CREATE TABLE horario_aluno (
    numero_viagem int,
    matricula_aluno int,
    foreign key (numero_viagem) references horario (numero),
    foreign key (matricula_aluno) references aluno (matricula)
);

CREATE TABLE veiculo (
    ano int,
    modelo varchar (15),
    chassi varchar (30),
    placa varchar (20),
    id_vel int primary key
);

CREATE TABLE vagas (
    vagas int,
    id_vel int,
    foreign key (id_vel) references veiculo (id_vel)
);