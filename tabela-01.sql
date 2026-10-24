CREATE DATABASE IF NOT EXISTS estudo CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE estudo;

--Criacao da Tabela
CREATE TABLE alunos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  curso VARCHAR(50),
  nota DECIMAL(4,2) 
);

--Criacao do Insert
INSERT INTO alunos (nome, curso, nota) VALUES
    ('Maria Silva', 'Computação', 8.50),
    ('João Souza', 'Direito', 6.00),
    ('Ana Costa', 'Computação', 9.50),
    ('Pedro Lima', 'Direito', 7.25),
    ('Juliana Rocha', 'Medicina', 9.00);

   --Metodo Select
    SELECT * FROM alunos;
    SELECT nome, nota FROM alunos;

  --Metodo WHERE(Filtra as linhas)
    SELECT * FROM alunos WHERE curso = 'Computação';
    SELECT * FROM alunos WHERE nome LIKE 'J%';
    SELECT * FROM alunos WHERE nota >= 8 AND curso = 'Medicina';
    SELECT nome, nota FROM alunos ORDER BY nota DESC;
    SELECT nome, nota FROM alunos ORDER BY nota DESC LIMIT 2;

   --Metodos Somar, Media, ARREDONDAR , Maximo . Minimo e Quantidade
    SELECT COUNT(*) FROM alunos;
    SELECT AVG(nota), MAX(nota), MIN(nota), SUM(nota) FROM alunos;
    SELECT ROUND(AVG(nota), 2) AS media FROM alunos;
     SELECT curso, COUNT(*) AS total, ROUND(AVG(nota), 2) AS media
     FROM alunos
     GROUP BY curso;
    --Having e uma condicao, que esta junta com o GROUP BY 
     SELECT curso, ROUND(AVG(nota), 2) AS media
     FROM alunos
     GROUP BY curso
     HAVING AVG(nota) > 8;
    

