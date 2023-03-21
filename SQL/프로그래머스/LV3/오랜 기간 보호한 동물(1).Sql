https://school.programmers.co.kr/learn/courses/30/lessons/59044#



-- 코드를 입력하세요
SELECT A.NAME, A.DATETIME
FROM    ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.ANIMAL_ID IS NULL
ORDER BY DATETIME ASC
LIMIT 3
;


INNER JOIN 만 해놓고, NULL값 이없는데 이게 뭐지 ....하면서 방황한 문제
