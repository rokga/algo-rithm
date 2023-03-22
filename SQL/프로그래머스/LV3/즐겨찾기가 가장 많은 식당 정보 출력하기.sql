https://school.programmers.co.kr/learn/courses/30/lessons/131123



    -- 코드를 입력하세요
SELECT
    FOOD_TYPE,
    REST_ID,
    REST_NAME,
    FAVORITES

FROM REST_INFO
WHERE FAVORITES IN(SELECT MAX(FAVORITES)
                   FROM REST_INFO
                   GROUP BY FOOD_TYPE)
GROUP BY FOOD_TYPE
ORDER BY FOOD_TYPE DESC


HAVING 은 GROUP BY 가 진행된 이후에 적용 되는 조건
WHERE GROUP BY 이전에 진행


