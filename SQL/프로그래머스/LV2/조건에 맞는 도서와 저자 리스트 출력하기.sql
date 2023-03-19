https://school.programmers.co.kr/learn/courses/30/lessons/144854





SELECT
    BOOK_ID,
    AUTHOR_NAME,
    DATE_FORMAT(PUBLISHED_DATE,'%Y-%m-%d')
FROM BOOK A
         JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE category LIKE "%경제"
ORDER BY PUBLISHED_DATE
;