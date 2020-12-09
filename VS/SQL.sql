create table test( 
  id int,
  champ_name varchar(15) unique not null, 
  k int not null check (k >= 0),
  death int not null check (death >= 0),
  assist int not null check (assist >= 0),
  cs int not null check (cs >= 0),
  primary key (id)
); 
-- 테이블 생성

insert into test values(1, 'Zed', 10, 2, 7, 199);
insert into test values(2, 'Ezreal', 4, 2, 1, 93);
insert into test values(3, 'Ahri', 2, 3, 2, 80);
insert into test values(4, 'Yasuo', 0, 7, 1, 40);
insert into test values(5, 'Garen', 4, 3, 9, 90);
insert into test values(6, 'Teemo', 0, 7, 1, 41);
insert into test values(7, 'Vayne', 0, 7, 1, 86);
insert into test values(8, 'Maokai', 3, 1, 12, 43);
insert into test values(9, 'Nasus', 7, 3, 5, 86);
insert into test values(10, 'Malfight', 12, 4, 3, 16);
insert into test values(11, 'Yone', 0, 7, 1, 63);
insert into test values(12, 'MasterYi', 21, 7, 11, 74);
insert into test values(13, 'nocturn', 7, 4, 6, 41);
insert into test values(14, 'Darius', 11, 3, 1, 94);
insert into test values(15, 'Samira', 14, 3, 0, 41);
insert into test values(16, 'Lussian', 13, 4, 2, 49);
insert into test values(17, 'Sena', 1, 6, 21, 79);
insert into test values(18, 'Kalistar', 2, 3, 1, 16);
insert into test values(19, 'Alistar', 2, 4, 2, 53);
insert into test values(20, 'Akali', 4, 2, 3, 92);
-- 데이터 삽입

alter table test drop column(victory);
-- 컬럼 안에 데이터 내용만 삭제(했는데 true 데이터는 날아가고 false 는 남음..)

update test set victory=TRUE where (k+assist)/death >= 3;
update test set victory=False where (k+assist)/death <= 3;
-- 평점이 3점 이상일때 승리 조건

alter table test add victory boolean;
alter table test add Tire char(1);

ALTER TABLE 테이블명 ALTER COLUMN 컬럼명 TYPE 원하는 타입
ALTER TABLE tierlist ALTER COLUMN victory TYPE boolean
--컬럼 데이터 타입 변경

alter table <TABLE> RENAME TO <NEW TABLE>
--테이블 이름 변경
-- alter table test RENAME TO list;

ALTER TABLE 테이블명 RENAME COLUMN 현재컬럼명 TO 새로운컬럼명;
-- 컬럼 이름 변경

update tierlist set lank = 'CHALLENGER' where lank = 'Challenger'; 
-- tierlist 테이블에 lank 컬럼이 'Challenger' 일때 lank 컬럼에 Challenger를CHALLENGER 로 바꿔준다.

update tierlist set victory = 'Win' where lank = 'BRONZE';
-- tierlist 테이블에 lank 컬럼이 'BRONZE' 일때 victory 컬럼에 Win 값을 넣어준다.
-- update 조건에 따른 코멘트 입력
-- boolean 값은 동시입력 x, 각 컬럼이름등이 '정확히' 똑같아야함.

create table ordinal_id (
  id int,
  PRIMARY KEY (id)
);
INSERT INTO ordinal_id VALUES (11);
INSERT INTO ordinal_id VALUES (12);
INSERT INTO ordinal_id VALUES (13);
INSERT INTO ordinal_id VALUES (14);
INSERT INTO ordinal_id VALUES (15);
INSERT INTO ordinal_id VALUES (16);
INSERT INTO ordinal_id VALUES (17);
INSERT INTO ordinal_id VALUES (18);
INSERT INTO ordinal_id VALUES (19);
INSERT INTO ordinal_id VALUES (20);

create table tierList(
  id int,
  Lank varchar(15) NOT NULL,
  Tier int NOT NULL,
  Period varchar(10) NOT NULL
);

insert into tierList values(101, 'BRONZE', 5, 'December');
insert into tierList values(201, 'SILVER', 4, 'December');
insert into tierList values(301, 'GOLD', 3, 'December');
insert into tierList values(401, 'PLATINUM', 2, 'December');
insert into tierList values(501, 'DIAMOND', 1, 'December');
insert into tierList values(601, 'Challenger', 0, 'December');

select list.id, list.champ_name, list.tier, victory tierList.lank, Tirelist.tier
from list, tierList
where id.champ_name = Name,
      
