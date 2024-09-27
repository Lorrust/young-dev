SELECT 
    ano.id AS id_ano,
    tipo.nome AS tipo,
    marca.nome AS marca,
    modelo.nome AS modelo,
    combustivel.nome AS combustivel,
    ano.ano_fabricacao,
    ano.valor::MONEY AS valor
FROM ano
INNER JOIN combustivel ON (combustivel.id = ano.id_combustivel)
INNER JOIN modelo ON (modelo.id = ano.id_modelo)
INNER JOIN marca ON (marca.id = modelo.id_marca)
INNER JOIN tipo ON (tipo.id = marca.id_tipo)
WHERE marca.nome ILIKE '%ferrari%'
ORDER BY ano.valor DESC;

SELECT * FROM marca
WHERE nome ILIKE '%si%'