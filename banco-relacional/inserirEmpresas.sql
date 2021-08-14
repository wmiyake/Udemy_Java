INSERT INTO mepresas (nome, cnpj)
    VALUES ('Bradesco', 23456323233232),
            ('Vale', 2356888686753),
            ('Cielo', 6893000393900);

ALTER TABLE mepresas MODIFY cnpj VARCHAR(14);

desc mepresas;

INSERT INTO empresas_unidades(empresa_id, cidade_id, sede)
    VALUES
        (1,1,1),
        (1,2,0),
        (2,1,0),
        (2,2,1);