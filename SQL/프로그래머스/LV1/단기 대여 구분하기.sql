SELECT
    HISTORY_ID,
    CAR_ID,
    DATE_FORMAT(START_DATE,'%Y-%m-%d') AS START_DATE,
    DATE_FORMAT(END_DATE,'%Y-%m-%d') AS END_DATE,
    CASE
        WHEN DATEDIFF(END_DATE,START_DATE) >= 29 THEN '장기 대여'
        ELSE '단기 대여'
        END AS RENT_TYPE
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY

WHERE
        DATE_FORMAT(START_DATE,'%Y-%m') = '2022-09'
ORDER BY HISTORY_ID DESC


--     *** DATE_FORAMT은 코테 하면서 풀어봐서 바로 변환 했는데
--
-- 기간 확인하는 함수를 몰라서 찾아보니까  DATEDIFF 라는 함수가 있어서 기간을 구할수 있었다.
--
-- ** 빌린날짜가 포함 되는 날이라 30일넣으면틀림 >> 29일