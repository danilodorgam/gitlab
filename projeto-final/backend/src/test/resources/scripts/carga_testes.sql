CREATE SCHEMA IF NOT EXISTS H2DB AUTHORIZATION sa;

create table H2DB.pessoa
(
    id int not null,
    nome varchar(255) not null,
    sobrenome varchar(255) not null,
    contato varchar(200) not null,
    email varchar(200) not null,
    cargo int not null
);

create unique index pessoa_contato_uindex
    on H2DB.pessoa (contato);

create unique index pessoa_email_uindex
    on H2DB.pessoa (email);

create unique index pessoa_id_uindex
    on H2DB.pessoa (id);

alter table H2DB.pessoa
    add constraint pessoa_pk
        primary key (id);

alter table H2DB.pessoa modify id int auto_increment;

INSERT INTO H2DB.pessoa (nome, sobrenome, contato, email, cargo) VALUES ('Danilo', 'D', '61993051236', 'maratona@stefanini.com', 1);

