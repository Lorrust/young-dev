-- Atividades Query

-- 1.1

SELECT * FROM aluno
FULL JOIN cidade ON (aluno.id_cidade = cidade.id)
FULL JOIN signo ON (aluno.id_signo = signo.id);

-- 1.2

SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE aluno.id_cidade IS NOT NULL
AND signo IS NOT NULL;

-- 2

SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE aluno.altura > 1.90
AND tipo_sanguineo ILIKE '%O%'
AND peso >= 70.0;

-- 3

SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE cidade.estado != 'SC'
AND aluno.sexo != 'F'
AND aluno.data_nascimento BETWEEN '1990-01-01' AND '2000-01-01';

-- 4


SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE signo.nome ILIKE 'Virgem'
AND aluno.peso BETWEEN 80.0 AND 90.0
AND cidade.cidade ILIKE 'Blumenau'
AND cidade.estado ILIKE 'SC';

-- 5


SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE cidade.cidade ILIKE 'Tubarão'
AND aluno.peso > 100.0
AND aluno.tipo_sanguineo ILIKE '%-%';

-- 6

SELECT DISTINCT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE aluno.nome ILIKE '%pedro%'
AND aluno.cpf ILIKE '%77';

-- 7

SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, aluno.celular, cidade.cidade, cidade.estado, signo.nome FROM aluno
INNER JOIN cidade ON (aluno.id_cidade = cidade.id)
INNER JOIN signo ON (aluno.id_signo = signo.id)
WHERE aluno.nome ILIKE 'La%'
AND aluno.celular LIKE '(48)%'
AND signo.nome != 'Libra'
AND aluno.tipo_sanguineo ILIKE '%B%';

-- 8


SELECT aluno.nome, aluno.sexo, aluno.tipo_Sanguineo, aluno.altura, aluno.peso, cidade.cidade, cidade.estado, aluno.id_signo FROM aluno
LEFT JOIN cidade ON (aluno.id_cidade = cidade.id)
LEFT JOIN signo ON (aluno.id_signo = signo.id)
WHERE cidade.cidade IN ('Florianópolis', 'Tubarão', 'Lages')
AND aluno.id_signo IS NULL
AND aluno.tipo_sanguineo ILIKE '%B%';

-- 9

SELECT ROUND(SUM(aluno.peso), 2) AS soma_peso, ROUND(AVG(aluno.altura), 2) AS media_altura, ROUND(AVG(aluno.peso), 2) as media_peso FROM aluno
LEFT JOIN cidade ON (aluno.id_cidade = cidade.id)
LEFT JOIN signo ON (aluno.id_signo = signo.id)
WHERE cidade.cidade = 'Tubarão';

-- 10

SELECT aluno.tipo_sanguineo, COUNT(*) AS quantidade, ROUND(AVG(aluno.altura), 2) AS media_idade, ROUND(AVG(aluno.peso), 2) AS media_peso FROM aluno
LEFT JOIN cidade ON (aluno.id_cidade = cidade.id)
LEFT JOIN signo ON (aluno.id_signo = signo.id)
WHERE cidade.cidade = 'Tubarão'
GROUP BY tipo_sanguineo;

-- 11

SELECT sexo, aluno.tipo_sanguineo, COUNT(*) AS quantidade_alunos, COUNT(DISTINCT cidade.cidade) AS cidades_diferentes FROM aluno
LEFT JOIN cidade ON (aluno.id_cidade = cidade.id)
LEFT JOIN signo ON (aluno.id_signo = signo.id)
GROUP BY sexo, tipo_sanguineo
ORDER BY sexo DESC, tipo_sanguineo;

-- 12

SELECT cidade.cidade, COUNT(*) as quantidade_alunos, COUNT(DISTINCT aluno.tipo_sanguineo) AS sangue_diferente, MAX(aluno.altura) AS maior_altura, MIN(aluno.peso) AS menor_peso FROM aluno
LEFT JOIN cidade ON (aluno.id_cidade = cidade.id)
LEFT JOIN signo ON (aluno.id_signo = signo.id)
GROUP BY cidade.cidade;

-- 13

SELECT signo.nome, aluno.sexo, COUNT(*) AS quantidade_alunos, ROUND(AVG(aluno.altura), 2) AS media_altura, MIN(aluno.peso) as menor_peso FROM aluno
LEFT JOIN cidade ON (aluno.id_cidade = cidade.id)
LEFT JOIN signo ON (aluno.id_signo = signo.id)
GROUP BY signo.nome, aluno.sexo;