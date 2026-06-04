create database empresa_games_prova 
default character set utf8mb4
default collate utf8mb4_general_ci;

create table salas(
id_salas int not null auto_increment primary key,
nome_sala varchar (50),
andar int
);

create table itens (
id_item int not null auto_increment primary key,
nome_item varchar (50),
tipo_do_item varchar(50),
quant_item int,
local_id int,
foreign key (local_id) references salas(id_salas)
);
insert into salas values
(default,'saguao','1'),
(default,'garagem','1'),
(default,'quarto principal','2'),
(default,'sala de jogos','2'),
(default,'sotao','3');

insert into itens values
(default,'erva verde','cura','3','1'),
(default, 'erva vermelha','cura','3','2'),
(default,'chave da casa principal','item chave','4','3'),
(default, 'muniçao de pistola','municao','2','4'),
(default, 'erva amarela','cura','3','5');

update itens 
set nome_item='chave castelo principal'
where id_item='3';

select i.nome_item , s.nome_sala
from itens as i inner join salas as s
on s.id_salas = i.local_id;


select tipo_do_item from itens
where tipo_do_item like 'muniçao';
