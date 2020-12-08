create table lol_champ( 
  id int,
  champ_name varchar(15) unique not null, 
  k int not null check (k >= 0),
  death int not null check (death >= 0),
  assist int not null check (assist >= 0),
  cs int not null check (cs >= 0),
  primary key (id)
); 
-- 테이블 생성

insert into lol_champ values(1, 'Zed', 10, 2, 7, 199);
insert into lol_champ values(2, 'Ezreal', 4, 2, 1, 93);
insert into lol_champ values(3, 'Ahri', 2, 3, 2, 80);
insert into lol_champ values(4, 'Yasuo', 0, 7, 1, 40);
insert into lol_champ values(5, 'Garen', 4, 3, 9, 90);
insert into lol_champ values(6, 'Teemo', 0, 7, 1, 41);
insert into lol_champ values(7, 'Vayne', 0, 7, 1, 86);
-- 데이터 삽입

alter table lol_champ drop column(victory);
-- 컬럼 안에 데이터 내용만 삭제(했는데 true 데이터는 날아가고 false 는 남음..)

alter table lol_champ add victory boolean;
alter table lol_champ add Tire char(1);

update lol_champ set victory = True where k >= 3;
update lol_champ set victory = False where k <= 3;

