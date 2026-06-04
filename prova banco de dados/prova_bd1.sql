create table assassinos(
id_asssassino int not null auto_increment primary key,
nome_assassino varchar (50) unique,
poder text,
velocidade decimal (2,1)
);

create table partidas(
id_pt int not null auto_increment primary key,
data_pt date,
mapa varchar (30),
num_sacrificio enum('0','1','2','3','4'),
id_ass int,
foreign key (id_ass) references assassinos (id_asssassino)
);

insert into assassinos values
(default, 'deporter','o deportador tem tuneis que se movem pelo o mapa, apos sair do tunel ele fica indetectavel por um tempo,caso ele pegue o survival de frente ele o cumprimenta e ativa uma skill check, caso o surv erre ele fica no estado morrendo ','4.4'),
(default, 'blue pen','o escritor azul derruba sua tinta pelo mapa por um tempo, deixando o surv que passar por cima em estado de lentidao e aumentando uma barra de infecçao por tinta, caso a barra fique cheia o surv fica exposto por 30 segundos e lento, passe alcool para limpar o achando em caixas no mapa', '4.4'),
(default, 'rich man','o rico lança avioes de dinheiro que chamam a atençao do surv, enquanto o rico fica indetectavel, caso o aviao acerte o surv escuta aplausos por tados os lados e fica cego por meio segundo','4.4');

select *from partidas;
 insert into partidas values
 (default, '2025-03-08','white house','3','1'),
 (default,'2024-12-05','baiao','2','2'),
 (default, '2020-02-03','sbt estudio','4','3'),
  (default, '2020-02-03','sbt estudio','2','3'),
  (default, '2020-02-03','sbt estudio','2','3');


select p.data_pt, p.mapa, p.num_sacrificio, a.nome_assassino
from partidas as p inner join assassinos as a
on a.id_asssassino = p.id_ass;






select avg(num_sacrificio) from partidas
where id_ass = 3;

truncate partidas;


