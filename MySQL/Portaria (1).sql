DROP DATABASE IF EXISTS portaria;
CREATE DATABASE portaria;
use portaria;

CREATE TABLE morador (
id_morador int AUTO_INCREMENT NOT NULL,
nome_morador varchar(50),
cpf_morador varchar(14),
idade_morador int,
num_condominio int,
num_bloco int,
vaga_estacionamento boolean,
dt_cadastro timestamp,
PRIMARY KEY (id_morador)
);

CREATE TABLE funcionario (
id_funcionario INT AUTO_INCREMENT NOT NULL,
nome_funcionario varchar(50),
cpf_funcionario varchar(14),
idade_funcionario int,
email_funcionario varchar(50),
senha_funcionario varchar(50),
is_adm boolean,
PRIMARY KEY (id_funcionario)
);

-- CREATE TABLE administrador (
-- id_administrador INT AUTO_INCREMENT NOT NULL,
-- nome_administrador varchar(50),
-- email_administrador varchar(50),
-- senha_administrador varchar(50),
-- PRIMARY KEY (id_administrador)
-- );

-- CREATE TABLE log_portaria (
-- id_log_portaria INT AUTO_INCREMENT NOT NULL,
-- id_morador int,
-- dt_saidamorador datetime,
-- dt_entradamorador datetime,
-- dt_cadastrolog datetime,
-- primary key (id_log_portaria),
-- foreign key (id_morador) references morador (id_morador)
-- );
insert into funcionario (nome_funcionario, cpf_funcionario, idade_funcionario, email_funcionario, senha_funcionario, is_adm) values("Rafao", "434.547.345-69", 21, "rafao@rafao.com.br", "2123", true);
insert into funcionario (nome_funcionario, cpf_funcionario, idade_funcionario, email_funcionario, senha_funcionario, is_adm) values("Bruno", "334.555.664-32", 11, "bruno@ig.com.br", "bruno11", false);


INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Roberta", "111.222.333-44", 19, 413, 6, 1, "25/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Rafael", "444.332.222-11", 20, 412, 6, 1, "27/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Roberta", "444.333.222-11", 20, 412, 6, 1, "27/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Joao", "444.333.222-11", 20, 412, 6, 1, "27/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Rafael", "555.543.542-21", 20, 412, 6, 1, "27/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Gabriel", "477.365.442-11", 20, 412, 6, 1, "27/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Joao", "354.353.552-55", 20, 412, 6, 1, "27/04/2022");
INSERT INTO morador(nome_morador, cpf_morador, idade_morador, num_condominio, num_bloco, vaga_estacionamento, dt_cadastro) VALUES("Gabriel", "998.885.462-77", 20, 412, 6, 1, "27/04/2022");

SELECT * from portaria.morador