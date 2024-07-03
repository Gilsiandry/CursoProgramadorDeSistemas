CREATE DATABASE aeroporto
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

drop database aeroporto;

CREATE TABLE aviões(
id INT NOT NULL AUTO_INCREMENT,
matricula VARCHAR(30) NOT NULL,
modelo VARCHAR(30),
marca VARCHAR(30),
assentos SMALLINT,
autonomia INT,
PRIMARY KEY (id));

CREATE TABLE pilotos(
id INT NOT NULL AUTO_INCREMENT,
matricula INT NOT NULL,
nome VARCHAR(40),
endereço TEXT,
telefone VARCHAR (15),
PRIMARY KEY (id));

CREATE TABLE voos(
id INT NOT NULL AUTO_INCREMENT,
data DATE NOT NULL,
horário TIME  NOT NULL,
local_partida CHAR (3),
destino CHAR (3),
PRIMARY KEY (id));

-- 5 pilotos, 2 aviõs, 2 voos

INSERT INTO aviões (matricula, modelo, marca, assentos, autonomia)
VALUES('123', 'Boeing 737', 'Boeing', 150, 5000),
	  ('456', 'Airbus A320', 'Airbus', 180, 4800);
      
	 SELECT * FROM aviões;
      
INSERT INTO pilotos (matricula, nome, endereço, telefone) VALUES
(123456, 'João Silva', 'Rua Exemplo, 123', '(61)1234-5678'),
(789012, 'Maria Oliveira', 'Avenida Teste, 456', '(63)9876-5432'),
(345678, 'Carlos Santos', 'Travessa Amostra, 789', '(71)4567-8901'),
(901234, 'Ana Costa', 'Praça Modelo, 321', '(32)8765-4321'),
(567890, 'Pedro Ferreira', 'Rua Testando, 789', '(21)2345-6789');

 SELECT * FROM pilotos;


INSERT INTO voos (data, horário, local_partida, destino) VALUES
('2024-06-10', '10:00:00', 'PMW','BSB'),
('2024-06-11', '11:30:00','GYN', 'GUA');

 SELECT * FROM voos;

DROP DATABASE AEROPORTO;

-- para exportar um backup do BD clica em Server, Data Export, Self-contained file, include creat schema, start export
-- para import um backup do BD clica em Server, Data Import, Self-contained file, default target schema, start import


-- 