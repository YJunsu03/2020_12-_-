CREATE FUNCTION function_name(param1 type, param2 type)
 -- function_name 함수 이름
 -- param1 type, param2 type 함수의 인자
 -- 인자의 이름 param1, 2
 -- type에 인자의 타입 쓰면됨
 RETURNS return_type AS
 -- return_type은 이 함수의 반환값의 타입 의미
BEGIN
 -- code(이곳에 함수가 실행할 코드 입력)
END;
LANGUAGE language_name;
--------------------------------------------------------------------------------
CREATE FUNCTION add(a INTEGER, b INTEGER)
RETURNS INTEGER AS
$$ BEGIN
    RETURN a+b;
END; $$
LANGUAGE PLPGSQL;

--------------------------------------------------
CREATE OR REPLACE FUNCTION getmaxmin(
    v1 NUMERIC, 
    v2 NUMERIC,
    OUT min_value NUMERIC,
    OUT max_value NUMERIC)
AS 
$$ BEGIN
    min_value := GREATEST(v1, v2);
    max_value := LEAST(v1, v2);
END; $$
LANGUAGE PLPGSQL;
------------------------------------------------------------
CREATE OR REPLACE FUNCTION getmaxmin2(
    INOUT v1 NUMERIC, 
    INOUT v2 NUMERIC)
AS 
$$ DECLARE
    v3 NUMERIC := v1;
BEGIN
    v1 := GREATEST(v2, v3);
    v2 := LEAST(v2, v3);
END; $$
LANGUAGE PLPGSQL;
----------------------------------------------------
CREATE OR REPLACE FUNCTION sum(VARIADIC params numeric[]) 
RETURNS numeric AS 
$$ DECLARE
    res numeric := 0;
BEGIN
    FOR i IN 1 .. array_length(params, 1) LOOP
        res := res + params[i];
    END LOOP;
    RETURN res;
END; $$ 
LANGUAGE plpgsql;
----------------------------------------------------------
