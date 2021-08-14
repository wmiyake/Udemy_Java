SELECT * FROM estados

select nome, sigla from estados

select sigla, nome from estados

select sigla, nome as 'Nome do Estado' from estados

select sigla, nome as 'Nome do Estado' from estados where regiao = 'Sul'

select nome, regiao from estados where populacao >= 10

select nome, regiao from estados where populacao >= 10 order by populacao

select nome, regiao from estados where populacao >= 10 order by populacao desc