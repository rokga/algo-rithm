https://school.programmers.co.kr/learn/courses/30/lessons/151139


SELECT
    MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(HISTORY_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY

WHERE CAR_ID IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE (DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10')
    GROUP BY CAR_ID
    HAVING COUNT(CAR_ID) >= 5
    ) AND (DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10')
GROUP BY MONTH, CAR_ID
HAVING RECORDS > 0
ORDER BY MONTH ASC, CAR_ID DESC;

--이번 문제는 많이어려워서 블로그를 참조해서 일단은 해결했다ㅜㅜ 한번 더 보고 제대로 다시 확인하기.
