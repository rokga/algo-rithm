https://school.programmers.co.kr/learn/courses/30/lessons/59042



-- 코드를 입력하세요
SELECT A.ANIMAL_ID, A.NAME
FROM    ANIMAL_OUTS A
            LEFT JOIN ANIMAL_INS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.ANIMAL_ID IS NULL
ORDER BY A.ANIMAL_ID
;


LEFT JOIN