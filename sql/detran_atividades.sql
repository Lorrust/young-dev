--1) Filtre os caminhões da marca “Volvo” fabricados entre os 
--anos de 2007 a 2011 e que tenham valor entre 150.000 e 190.000;

--2) Filtre os caminhões da marca “Volvo” e que contenha no modelo
-- a palavra “6x4” ordenando pelo valor;

--3) Conte e some o valor de todas as motos da marca “honda” 
--fabricados entre 2000 e 2005 agrupando pelo ano de fabricação e ordenando pela quantidade;


SELECT * FROM modelo
INNER JOIN marca ON (modelo.id_marca = marca.id)
INNER JOIN ano ON (modelo.id = ano.id_modelo)
WHERE marca.id_tipo = 3
AND marca.nome ILIKE 'VOLVO'
AND (ano.ano_fabricacao BETWEEN 2007 AND 2011)
AND (ano.valor BETWEEN 150000 AND 190000);


SELECT * FROM modelo
INNER JOIN marca ON (modelo.id_marca = marca.id)
INNER JOIN ano ON (modelo.id = ano.id_modelo)
WHERE marca.id_tipo = 3
AND marca.nome ILIKE 'VOLVO'
AND modelo.nome ILIKE '%6x4%'
ORDER BY ano.valor


SELECT * FROM modelo, ano.ano_fabricacao
INNER JOIN marca ON (modelo.id_marca = marca.id)
INNER JOIN ano ON (modelo.id = ano.id_modelo)
WHERE marca.id_tipo = 2
AND marca.nome ILIKE 'Honda'
AND (ano.ano_fabricacao BETWEEN 2000 AND 2005)
GROUP BY ano_fabricacao
ORDER BY ano.valor