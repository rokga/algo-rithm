https://school.programmers.co.kr/learn/courses/30/lessons/157341


 서브쿼리 사용.
    -- 코드를 입력하세요
SELECT
    CAR_ID
FROM    CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = '세단' AND CAR_ID IN(SELECT CAR_ID
                                    FROM    CAR_RENTAL_COMPANY_RENTAL_HISTORY
                                    WHERE   MONTH(START_DATE) = 10
    )
ORDER BY CAR_ID DESC;


    JOIN사용


