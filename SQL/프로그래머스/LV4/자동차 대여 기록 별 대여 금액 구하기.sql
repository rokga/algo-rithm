https://school.programmers.co.kr/learn/courses/30/lessons/151141


-- 코드를 입력하세요
SELECT  B.HISTORY_ID,
        ROUND((DATEDIFF(B.END_DATE,B.START_DATE)+1) * A.DAILY_FEE *
              (CASE
                   WHEN DATEDIFF(B.END_DATE,B.START_DATE)+1 < 7 THEN 1
                   WHEN DATEDIFF(B.END_DATE,B.START_DATE)+1 < 30 THEN 0.95
                   WHEN DATEDIFF(B.END_DATE,B.START_DATE)+1 < 90 THEN 0.92
                   ELSE 0.85 END))  AS FEE

FROM CAR_RENTAL_COMPANY_CAR A
         JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B ON A.CAR_ID = B.CAR_ID
WHERE A.CAR_TYPE LIKE "트럭"
GROUP BY HISTORY_ID
ORDER BY 2 DESC , 1 DESC



조인으로만 해결 !


with를 사용해서도 해봐야겠다