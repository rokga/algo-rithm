https://school.programmers.co.kr/learn/courses/30/lessons/59410

SELECT
    ANIMAL_TYPE,
    COALESCE(NAME,'No name'),
    SEX_UPON_INTAKE

FROM
    ANIMAL_INS
ORDER BY ANIMAL_ID;