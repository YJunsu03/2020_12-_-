---------- 이사님의 발표 과제 -------------
-- 과제 내용 : 테이블을 만들고 관계성 부여하고,
-- 설명하기
CREATE DATABASE Task;
-- Task(과제) DB 생성
CREATE TABLE jobKind (
    id int,
    name varchar(15) unique not null,
    description varchar(50) not null, 
    PRIMARY KEY (id)
);
INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
 INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
 INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
 INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
 INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
 INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
 INSERT INTO jobkind VALUES(1, 'DBM', '데이터베이스를
 관리하는 직업');
--------------------------------------------------------
CREATE TABLE jobMp (
    id int,
    jobMp int not null,
    -- 월급(monthly paycheck)
    jobAc int not null,
    -- 연봉(annual income)
    PRIMARY KEY (id)
);

--------------------------------------------------------
CREATE TABLE jobFo(
    -- 향후 전망(Future Outlook)
    id int,
    jobOl varchar(10) not null,
    PRIMARY KEY (id)
);
--------------------------------------------------------
CREATE TABLE jobEl(
-- 평가 (evaluate)
    id int,
    jobEs varchar(50) not null, 
-- 주관적 (subjective)
    jobTier int not null,
    PRIMARY KEY (id)
);
--------------------------------------------------------