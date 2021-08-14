SELECT c.nome, c.nome
    FROM mepresas e, empresas_unidades eu, cidades c 
        where e.id = eu.empresa_id 
            and c.id = eu.cidade_id AND SEDE


SELECT c.nome Empresa, c.nome as Cidade
    FROM mepresas e, empresas_unidades eu, cidades c 
        where e.id = eu.empresa_id 
            and c.id = eu.cidade_id AND SEDE