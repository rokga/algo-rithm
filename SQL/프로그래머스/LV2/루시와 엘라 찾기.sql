https://school.programmers.co.kr/learn/courses/30/lessons/59046


    동물 보호소에 들어온 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty인 동물의 아이디와 이름, 성별 및 중성화 여부를 조회하는 SQL 문을 작성해주세요.



SELECT ANIMAL_ID,NAME,SEX_UPON_INTAKE
FROM
    ANIMAL_INS
WHERE
    NAME LIKE "Lucy%" OR NAME LIKE "Ella%" OR NAME LIKE "Pickle%" OR NAME LIKE "Rogan%" OR NAME LIKE "Sabrina%" OR NAME LIKE "Mitty%"
ORDER BY ANIMAL_ID ;


처음에 그냥 LIKE로 작성하고, 코드 줄이고 여러방법 찾기.

SELECT ANIMAL_ID,NAME,SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE
    NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID
    ;


정규표현식 사용

SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME REGEXP '^(Lucy|Ella|Pickle|Rogan|Sabrina|Mitty)$'
ORDER BY ANIMAL_ID
;
