-- 챔피언 승/패 정보 테이블

CREATE TABLE Victory_info (
    id int,
    victory varchar(10),
    Win_Lose_Judgment boolean 
);

INSERT INTO Victory_info VALUES (1, '');
INSERT INTO Victory_info VALUES (2, '');
INSERT INTO Victory_info VALUES (3, '');
INSERT INTO Victory_info VALUES (4, '');
INSERT INTO Victory_info VALUES (5, '');
INSERT INTO Victory_info VALUES (6, '');
INSERT INTO Victory_info VALUES (7, '');
INSERT INTO Victory_info VALUES (8, '');
INSERT INTO Victory_info VALUES (9, '');
INSERT INTO Victory_info VALUES (10, '');
INSERT INTO Victory_info VALUES (11, '');
INSERT INTO Victory_info VALUES (12, '');
INSERT INTO Victory_info VALUES (13, '');
INSERT INTO Victory_info VALUES (14, '');
INSERT INTO Victory_info VALUES (15, '');
INSERT INTO Victory_info VALUES (16, '');
INSERT INTO Victory_info VALUES (17, '');
INSERT INTO Victory_info VALUES (18, '');
INSERT INTO Victory_info VALUES (19, '');
INSERT INTO Victory_info VALUES (20, '');

UPDATE Victory_info set Win_Lose_Judgment = true where id > 10;
UPDATE Victory_info set Win_Lose_Judgment = false where id <= 10;

update Victory_info set victory = 'Lose...' where Win_Lose_Judgment='f';
update Victory_info set victory = 'Win!' where Win_Lose_Judgment='t';