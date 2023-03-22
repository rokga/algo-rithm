https://school.programmers.co.kr/learn/courses/30/lessons/59411




-- 코드를 입력하세요
SELECT
    B.ANIMAL_ID,
    B.NAME
FROM    ANIMAL_INS A
            JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.DATETIME IS NOT NULL
ORDER BY (B.DATETIME-A.DATETIME) DESC
    LIMIT 2
;