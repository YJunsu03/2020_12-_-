---------- 이사님의 발표 과제 -------------
-- 과제 내용 : 테이블을 만들고 관계성 부여하고,
-- 설명하기
CREATE DATABASE Task;
-- Task(과제) DB 생성
CREATE TABLE jobEn (
    id int,
    name varchar(15) unique not null,
    description varchar(50) not null, 
    PRIMARY KEY (id)
);
 INSERT INTO joben VALUES(1, 'DBA', '데이터베이스를 관리하는 직업');
 INSERT INTO joben VALUES(2, 'POLICE', '시민의 치안을 지키는 직업');
 INSERT INTO joben VALUES(3, 'Teacher', '학생들을 교육하는 직업');
 INSERT INTO joben VALUES(4, 'FIREFIGHTER', '화재 발생시 가장 먼저 출동하는 직업.');
 INSERT INTO joben VALUES(5, 'JUDGE', '죄를 판결하는 직업.');
 
 -- update joben set name='DBA' where name='DBM';

 SELECT CC.COLUMN_NAME AS COLUMN_NAME
  FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS       TC
      ,INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE CC
 WHERE TC.TABLE_CATALOG   = 'task'
   AND TC.TABLE_NAME      = 'joben'
   AND TC.CONSTRAINT_TYPE = 'PRIMARY KEY'
   AND TC.TABLE_CATALOG   = CC.TABLE_CATALOG
   AND TC.TABLE_SCHEMA    = CC.TABLE_SCHEMA
   AND TC.TABLE_NAME      = CC.TABLE_NAME
   AND TC.CONSTRAINT_NAME = CC.CONSTRAINT_NAME
--------------------------------------------------------
CREATE TABLE jobMp (
    id int,
    jobMp int not null,
    -- 월급(monthly paycheck)
    jobAc int not null
    -- 연봉(annual income)
);
 INSERT INTO jobmp VALUES(1, '6000000', '72000000');
 INSERT INTO jobmp VALUES(2, '3000000', '36000000');
 INSERT INTO jobmp VALUES(3, '3000000', '36000000');
 INSERT INTO jobmp VALUES(4, '2800000', '33600000');
 INSERT INTO jobmp VALUES(5, '5000000', '60000000');
--------------------------------------------------------
CREATE TABLE jobFo(
    -- 향후 전망(Future Outlook)
    id int,
    jobOl varchar(10) not null
);
 INSERT INTO jobfo VALUES(1, '희망적');
 INSERT INTO jobfo VALUES(2, '희망적');
 INSERT INTO jobfo VALUES(3, '보편적');
 INSERT INTO jobfo VALUES(4, '보편적');
 INSERT INTO jobfo VALUES(5, '희망적');
--------------------------------------------------------
CREATE TABLE jobEv(
-- 평가 (evaluate)
    id int,
    name varchar(20) not null,
    jobEs varchar(150) not null, 
-- 주관적 (subjective)
    jobTier int not null
);
 -- alter table jobel alter column jobes type varchar(100);
 INSERT INTO jobel VALUES(1, '데이터베이스 관리자', '현재 DB 관리자는 통계적으로도 전망이 매우 밝다고 생각함', 1);
 INSERT INTO jobel VALUES(2, '경찰', '경찰은 공무원이기에 혜택이 좋아 이 직업이 된다면 명예와 혜택이 같이 따른다', 2);
 INSERT INTO jobel VALUES(3, '교사', '선생님 또한 교육 공무원이기에 일에 맞는다면 매우 괜찮은 직업이 될 것이다.', 3);
 INSERT INTO jobel VALUES(4, '소방관', '소방사는 위험한 일들이 많기에 국가의 자랑이라 해도 무방할 정도로 존경스런 직업중 하나 이다.', 3);
 INSERT INTO jobel VALUES(5, '판사', '죄인을 판결하는 직업, 다들 알다시피 연봉이 어마무시하다.', 1);

alter table jobel drop PRIMARY KEY (id);
 alter table jobel alter column id type varchar(15);
-------------------------------------------------------
-- 조인
select jobfo.id, jobel.name, joben.description,
        jobmp.jobac
from jobfo
join jobel on jobel.id = jobfo.id
join joben on jobel.id = joben.id
join jobmp on jobmp.id = joben.id; 