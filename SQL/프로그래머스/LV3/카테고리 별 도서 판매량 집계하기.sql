https://school.programmers.co.kr/learn/courses/30/lessons/144855




    -- 코드를 입력하세요
SELECT
    A.CATEGORY,
    SUM(B.SALES) AS TOTAL_SALES
FROM    BOOK A
            JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID
WHERE B.SALES_DATE LIKE '%2022-01%'
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY

    WHERE 절 GROUP BY 절 보다 먼저 쓰기.