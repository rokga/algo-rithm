https://school.programmers.co.kr/learn/courses/30/lessons/157342





    -- 코드를 입력하세요
SELECT
    CAR_ID,
    ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1) AS AVERAGE_DURATION

FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
HAVING AVERAGE_DURATION >= 7
ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC
;


DATEDIFF 때문에 쪼금애먹었다.
    시작한날도 포함하는거 때문에 +1 을 추가.