https://school.programmers.co.kr/learn/courses/30/lessons/157339


    1. 자동차 종류 - 세단 , SUV
    2. 2022년 11월 1일 ~ 30일 대여가능
    3. 대여금액 50만이상 200만 미만
    4. 대여금액 내림차순 - 자동차 종류 기준 오름차순 -자동차ID 기준 내림차순


SELECT  *
FROM            (
                  SELECT
                      C.CAR_ID,
                      C.CAR_TYPE,
                      ROUND(((C.DAILY_FEE*30) * (100-DISCOUNT_RATE) / 100), 0) AS FEE
                  FROM CAR_RENTAL_COMPANY_CAR C
                    JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P ON C.CAR_TYPE = P.CAR_TYPE
                  WHERE C.CAR_TYPE IN ('세단', 'SUV')
                    AND C.CAR_ID NOT IN (
                                            SELECT H.CAR_ID
                                            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
                                            WHERE H.START_DATE <= '2022-11-30'
                                                AND H.END_DATE >= '2022-11-01'
                                        )
                    AND P.DURATION_TYPE = '30일 이상'
              ) AS t1
WHERE FEE BETWEEN 500000 AND 2000000
ORDER BY FEE DESC, CAR_TYPE ASC, CAR_ID DESC