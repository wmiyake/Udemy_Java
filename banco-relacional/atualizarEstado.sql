update estados
set nome = 'Maranhão'
where sigla = 'MA'

select nome from estados where sigla = 'MA'

select est.nome from estados est where sigle = "MA"

update estados set nome = 'Paraná', populacao = 11.32 where sigla = 'PR'

select Sigla, Nome, Populacao from estados where sigla = 'PR'