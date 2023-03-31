https://school.programmers.co.kr/learn/courses/30/lessons/164668





SELECT
    B.USER_ID,
    B.NICKNAME,
    SUM(A.PRICE) AS TOTAL_SALES
FROM    USED_GOODS_BOARD A
            LEFT JOIN USED_GOODS_USER B ON A.WRITER_ID = B.USER_ID
WHERE STATUS = 'DONE'
GROUP BY B.USER_ID
HAVING SUM(A.PRICE) >= 700000
ORDER BY TOTAL_SALES


LEFT JOIN 후  상태가 'DONE' 인 데이터만 가져온뒤, 그룹화  >  합이 70만 이상인 데이터만 고르기.