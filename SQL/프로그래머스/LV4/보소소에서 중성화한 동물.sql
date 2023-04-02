https://school.programmers.co.kr/learn/courses/30/lessons/59045#fnref1

--  JOIN을 이용한 풀이

SELECT  O.ANIMAL_ID,
        O.ANIMAL_TYPE,
        O.NAME

FROM    ANIMAL_INS I
            JOIN    ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID

WHERE
    (O.SEX_UPON_OUTCOME LIKE 'Neutered%' OR O.SEX_UPON_OUTCOME LIKE'Spayed%')
  AND I.SEX_UPON_INTAKE LIKE 'Intact%'
ORDER BY O.ANIMAL_ID
;


-- 서브쿼리 사용한 풀이.

    SELECT  ANIMAL_ID,
        ANIMAL_TYPE,
        NAME
FROM
        ANIMAL_OUTS
WHERE ANIMAL_ID IN (SELECT ANIMAL_ID
                     FROM ANIMAL_INS
                     WHERE SEX_UPON_INTAKE LIKE '%Intact%') &&
                    (SEX_UPON_OUTCOME LIKE '%Spayed%' || SEX_UPON_OUTCOME LIKE "%Neutered%")


