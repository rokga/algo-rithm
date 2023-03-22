https://school.programmers.co.kr/learn/courses/30/lessons/77487




-- 코드를 입력하세요
SELECT
    *
FROM    PLACES

WHERE HOST_ID IN(  SELECT HOST_ID
                    FROM PLACES
                    GROUP BY HOST_ID
                    HAVING COUNT(HOST_ID) > 1)
;
다른 정답들을 확인해보니 WHERE 절 말고도 FROM 절 서브쿼리도 있길레 풀어봤다.

SELECT  A.ID,
        A.NAME,
        A.HOST_ID
FROM PLACES A
                JOIN (SELECT HOST_ID
                      FROM PLACES
                      GROUP BY HOST_ID
                      HAVING COUNT(HOST_ID) > 1) B
                ON A.HOST_ID = B.HOST_ID
ORDER BY A.ID
;


