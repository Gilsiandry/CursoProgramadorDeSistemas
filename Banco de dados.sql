CREATE DATABASE banco
DEFAULT CHARACTER SET utf8
DEFAULT COLLATE utf8_general_ci;

CREATE TABLE pessoas(
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
sexo ENUM('M','F'),
peso DECIMAL (5,2),
altura  DECIMAL (3,2),
nacionalidade VARCHAR(20) DEFAULT 'Brasil',
PRIMARY KEY (id));

DROP TABLE pessoas; -- apaga a tabela

INSERT INTO pessoas(nome, sexo, peso, altura)
Values('Gilsiandry','F',58,1.58),
	  ('Maynara', 'F',59,1.60),
      ('Adril', 'M', 82,1.70),
      ('Higor','M',103,1.87),
	  ('Pedro', 'M',63,1.76),
      ('Luiz Felipe','M',67,1.78),
      ('Luiz Gustavo','M',110,1.93),
	  ('Felipe', 'M',57,1.76),
      ('Arthur', 'M', 80,1.85),
      ('Adrian', 'M', 61,1.73),
      ('Anderson', 'M', 69,1.73);
      
      SELECT * FROM pessoas;

-- para alterar uma tabela já criada usa o comando ALTER TABLE nome_tabela   ADD COLUMN campo tipo;

ALTER TABLE pessoas
ADD COLUMN cpf varchar (15);

-- para alterar uma tabela já criada usa o comando ALTER TABLE nome_tabela   DROP COLUMN campo;

ALTER TABLE pessoas
DROP COLUMN cpf;

-- para adicionar uma coluna em uma determinada posição usa o comando ALTER TABLE nome_tabela   ADD COLUMN campo tipo AFTER campo;

-- para adicionar uma coluna na primeira posição usa o comando ALTER TABLE nome_tabela   ADD COLUMN campo tipo FIRST;

ALTER TABLE pessoas
ADD COLUMN cpf VARCHAR(15) AFTER nome;

-- para mudar o tipo da coluna usa o comando ALTER TABLE nome_tabela   MODIFY COLUMN campo tipo;

ALTER TABLE pessoas
MODIFY COLUMN cpf INT;

-- para modificar o nome das colunas usa o comando ALTER TABLE nome_tabela   CHANGE COLUMN nome novo_nome tipo;

ALTER TABLE pessoas
CHANGE COLUMN cpf CPF VARCHAR(15);


-- para renomear o nome da tabela usa o comando ALTER TABLE nome_tabela   RENAME TO novo_nome;

ALTER TABLE pessoas
RENAME TO alunos;

ALTER TABLE alunos
RENAME TO pessoas;

SELECT * FROM alunos;


CREATE TABLE cursos(
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(20) NOT NULL UNIQUE,
desrição TEXT,
carga_horária INT UNSIGNED,
total_aulas INT UNSIGNED,
ano YEAR DEFAULT 2024,
PRIMARY KEY (id));

-- caso esqueça de criar a coluna da chave primária usa o comando ALT TABLE nome_tabela   ADD COLUMN id  INT FIRST;
-- para escolher a chave primária usa o comando  ALTER TABLE nome_tabela   ADD PRIMARY KEY (id);
-- para auto incrementar a primary key usa o comando ALTER TABLE nome_tabela   MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT;

ALTER TABLE cursos
CHANGE COLUMN desrição descrição TEXT;

ALTER TABLE cursos
MODIFY COLUMN nome VARCHAR(40);



INSERT INTO cursos(nome, descrição, carga_horária, total_aulas, ano)
Values('Programador de Sistemas','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',200,42, 2024),
	  ('Lógica de Programação','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',60,15, 2024),
      ('Banco de Dados','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',60,20,2024),
      ('Power BI','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',60,20,2025),
      ('Sistemas de Informação','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',3600,840,2024),
      ('Ciência da Computação','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',60,20,2025),
      ('Programação Web','Evidentemente, a constante divulgação das informações desafia a capacidade de equalização dos procedimentos normalmente adotados',60,15, 2024);
      
      SELECT * FROM cursos;
      
      -- para modificar os registros/valores de uma tabela usa o comando  UPDATE table   SET atributo = 'novo_valor'   WHERE id = num_id;
      
      -- para alterar um atributo por vez:
      UPDATE cursos
      SET carga_horária = '3600'
      WHERE id = 6;
      
       -- para alterar vários atributos de uma vez:
      UPDATE cursos
      SET total_aulas = 840, ano = '2026'
      WHERE id = 6;

-- para modificar os registros sem usar a chave primária usa o comando UPDATE nome_tabela   SET atributo >= 'novo_valor', atributo >= 'novo_valor'   WHERE atributo >= num;
-- para limitar as modificações dos registros usa o comando UPDATE table   SET atributo = 'novo_valor'   WHERE atributo >= num   LIMITED 2;

-- para deletar um registro usa o comando DELETE FROM nome_tabela    WHERE id = num;

-- para apagar todos os registros da tabela usa o comando TRUNCATE TABLE nome_tabela;  ou DELETE FROM nome_tabela;


      