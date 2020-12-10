-- 킬뎃 기본정보와 평점 테이블
CREATE TABLE kda_info (
    id int,
    Name varchar(20) unique not null,
    kill int not null check(kill > 0),
    death int not null check(death > 0),
    assist int not null check(assist > 0),
    cs int not null check(cs > 0),
    PRIMARY KEY (id)
);

INSERT INTO kda_info VALUES (1, 'Rumble', 5, 2, 2, 120);
INSERT INTO kda_info VALUES (2, 'Garen', 3, 4, 7, 200);
INSERT INTO kda_info VALUES (3, 'Darius', 5, 4, 1, 320);
INSERT INTO kda_info VALUES (4, 'Piora', 13, 3, 9, 540);
INSERT INTO kda_info VALUES (5, 'Jax', 7, 2, 11, 134);
INSERT INTO kda_info VALUES (6, 'Master Yi', 31, 9, 13, 432);
INSERT INTO kda_info VALUES (7, 'Lilia', 5, 4, 31, 675);
INSERT INTO kda_info VALUES (8, 'Zak', 4, 3, 21, 123);
INSERT INTO kda_info VALUES (9, 'Yiblin', 11, 4, 3, 321);
INSERT INTO kda_info VALUES (10, 'Yasuo', 1, 7, 1, 7);
INSERT INTO kda_info VALUES (11, 'Yone', 1, 6, 1, 8);
INSERT INTO kda_info VALUES (12, 'Ahri', 5, 2, 2, 122);
INSERT INTO kda_info VALUES (13, 'Daiana', 8, 4, 6, 127);
INSERT INTO kda_info VALUES (14, 'Kaisa', 8, 1, 2, 132);
INSERT INTO kda_info VALUES (15, 'Ms.For', 11, 3, 2, 184);
INSERT INTO kda_info VALUES (16, 'Apelios', 13, 6, 4, 195);
INSERT INTO kda_info VALUES (17, 'Yumi', 1, 4, 31, 167);
INSERT INTO kda_info VALUES (18, 'Reona', 3, 3, 13, 194);
INSERT INTO kda_info VALUES (19, 'Alistar', 2, 4, 6, 112);
INSERT INTO kda_info VALUES (20, 'Sona', 2, 6, 9, 111);

