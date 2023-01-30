create table inscrit(id_inscrit serial primary key,mail varchar(50),pseudo varchar(50),nom varchar(50),mot_de_passe varchar(8));
create table film(id_film serial primary key,titre varchar(50),duree int,dateSortie date);
create table genre(id_genre serial primary key,intitule varchar(50));
create table critique(id_commentaire serial primary key,titre varchar(50),commentaire varchar(50),date_validiter date,id_inscrit int references inscrit(id_inscrit),id_film int references film(id_film)); 
create table appartient(id_genre int references genre(id_genre),id_film int references film(id_film)); 

insert into film values (default,'The way with baby',147,to_date('1/10/2017','dd/MM/yyyy'));
insert into film values (default,'Samarkand',147,to_date('11/11/2017','dd/MM/yyyy'));
insert into film values (default,'Life with me',147,to_date('31/12/2017','dd/MM/yyyy'));
insert into film values (default,'The Caserne',147,to_date('1/11/2018','dd/MM/yyyy'));
insert into film values (default,'Job with friend',147,to_date('13/12/2018','dd/MM/yyyy'));
insert into film values (default,'Citoyen',147,to_date('14/3/2018','dd/MM/yyyy'));
insert into film values (default,'The best',147,to_date('1/1/2018','dd/MM/yyyy'));
insert into film values (default,'Chamber',147,to_date('1/1/2019','dd/MM/yyyy'));
insert into film values (default,'The moon with boss',147,to_date('15/3/2019','dd/MM/yyyy'));
insert into film values (default,'The Jakarta',147,to_date('20/6/2019','dd/MM/yyyy'));
insert into film values (default,'The result',147,to_date('5/7/2019','dd/MM/yyyy'));
insert into film values (default,'Choice',147,to_date('10/8/2019','dd/MM/yyyy'));
insert into film values (default,'Chamber in lake',147,to_date('15/10/2020','dd/MM/yyyy'));
insert into film values (default,'The commander',205,to_date('15/10/2020','dd/MM/yyyy'));
insert into film values (default,'My way',105,to_date('15/10/2021','dd/MM/yyyy'));
insert into film values (default,'Your objectif',159,to_date('25/1/2021','dd/MM/yyyy'));
insert into film values (default,'Kazanova',147,to_date('17/5/2021','dd/MM/yyyy'));
insert into film values (default,'Night club',147,to_date('14/10/2022','dd/MM/yyyy'));
insert into film values (default,'Harry Potter a lecole des sorciers',147,to_date('5/7/2021','dd/MM/yyyy'));
insert into film values (default,'Jango with you',147,to_date('8/10/2021','dd/MM/yyyy'));
insert into film values (default,'The finish',147,to_date('1/10/2022','dd/MM/yyyy'));
insert into film values (default,'Call police with him',147,to_date('15/8/2023','dd/MM/yyyy'));
insert into film values (default,'Dog with person',147,to_date('11/10/2023','dd/MM/yyyy'));
insert into film values (default,'Harry Potter et la Chambre des secrets',147,to_date('12/7/2020','dd/MM/yyyy'));
insert into film values (default,'Hit up',147,to_date('1/11/2021','dd/MM/yyyy'));



insert into genre values (default,'Aventure');
insert into genre values (default,'Guerre');
insert into genre values (default,'Comédie');
insert into genre values (default,'Drame');
insert into genre values (default,'Science fiction');
insert into genre values (default,'Fantastique');
insert into genre values (default,'Western');
insert into genre values (default,'Horreur');



insert into inscrit values (default,'carmen.d@yahoo.com','carmenosi','LEROY','carler12');
insert into inscrit values (default,'dum.k@hotmail.com','dum','DUMONT','45dakota');
insert into inscrit values (default,'del23.d@gmail.com','della','DELPIERRE','tamir8');
insert into inscrit values (default,'card@yahoo.com','carrenn','CARON','samuel9');
insert into inscrit values (default,'amar@gmail.com','marin','MARTIN','karen159');
insert into inscrit values (default,'nata@yahoo.com','deldel','DELNATTE','samara87');




insert into appartient values (1,1);
insert into appartient values (1,5);
insert into appartient values (1,10);
insert into appartient values (2,25);
insert into appartient values (2,4);
insert into appartient values (2,8);
insert into appartient values (2,7);
insert into appartient values (3,6);
insert into appartient values (3,9);
insert into appartient values (3,3);
insert into appartient values (3,2);
insert into appartient values (4,19);
insert into appartient values (4,21);
insert into appartient values (4,20);
insert into appartient values (5,24);
insert into appartient values (5,15);
insert into appartient values (5,16);
insert into appartient values (6,17);
insert into appartient values (6,18);
insert into appartient values (6,23);
insert into appartient values (7,25);
insert into appartient values (7,22);
insert into appartient values (7,13);
insert into appartient values (8,14);
insert into appartient values (8,11);
insert into appartient values (8,12);



insert into critique values (default,'negatif','Comment to film Harry Potter et la Chambre',to_date('19/5/2020','dd/MM/yyyy'),1,1);
insert into critique values (default,'super negatif','Comment to film Chamber in lake',to_date('15/3/2020','dd/MM/yyyy'),2,3);
insert into critique values (default,'moyenne negatif','Comment to film My way',to_date('19/8/2021','dd/MM/yyyy'),3,10);
insert into critique values (default,'positif','Comment to film Dog with person',to_date('16/6/2022','dd/MM/yyyy'),4,15);
insert into critique values (default,'super positif','Comment to film The best',to_date('18/11/2023','dd/MM/yyyy'),5,20);
insert into critique values (default,'moyenne positif','Comment to film Kazanova',to_date('15/12/2023','dd/MM/yyyy'),2,8);
insert into critique values (default,'impeccable','Comment to film The finish',to_date('14/10/2023','dd/MM/yyyy'),4,7);
insert into critique values (default,'impeccable+','Comment to film The finish+',to_date('15/10/2023','dd/MM/yyyy'),4,7);





