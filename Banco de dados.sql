CREATE DATABASE senac;

USE  senac;

CREATE TABLE alunos(
	matricula INTEGER,
    nome VARCHAR(50),
	data_nascimento DATE);

CREATE TABLE professor(
	matricula INTEGER,
    nome VARCHAR(50),
	especialidade VARCHAR (20));

CREATE TABLE  cursos (
	codigo INTEGER,
    nome VARCHAR(50),
	descricao TEXT);

INSERT INTO alunos(matricula, nome, data_nascimento)
Values(001,'Gilsiandry','1993-04-08'),
	  (002, 'Maynara', '2008-02-23');
      
INSERT INTO alunos(matricula, nome, data_nascimento)
Values(003,'Higor','2001-09-16'),
	  (004, 'Arthur', '2007-11-28'),
      (005,'Lala','2000-06-10'),
	  (006, 'Dipsy', '2000-02-10'),
      (007,'Sol','2001-09-16'),
	  (008, 'Lua', '2003-11-02');
      
SELECT * FROM  alunos; -- esse comando consulta os dados na tabela

INSERT INTO professor(matricula, nome, especialidade)
Values(001,'Fred Mercury','1946-09-05'),
	  (002,'Elvis Presley','1935-01-08'),
      (003,'Chester','1976-03-20'),
      (004,'Michael Jackson','1935-01-08'),
      (005,'Kurt Cobain','1967-02-20'),
      (006,'Amy Winehouse','1983-09-14'),
      (007,'Tim Maia','1942-09-28');
      
SELECT * FROM  professor;

INSERT INTO cursos(codigo, nome, descricao)
Values(001,'Como cuidar da sua vida','Deixar os outros em paz'),
	  (002,'Como ocutar um cadaver','lalalala'),
      (003,'Como espirrar baixo','lalala'),
      (004,'Como ser mais sutil','lalalala'),
      (005,'Como ser menas','lalala'),
      (006,'Como emilinar Java da sua vida','lalala'),
      (007,'Como humilhar o colega educadamente','lalalala');

SELECT * FROM  cursos;


-- para excluir um banco usa o comando: DROP DATABASE nomedobanco;
-- para excluir uma tabela usa o comando: DROP DATABASE nomedatabela;


