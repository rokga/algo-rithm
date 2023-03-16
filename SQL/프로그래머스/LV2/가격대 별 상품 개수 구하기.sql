https://school.programmers.co.kr/learn/courses/30/lessons/131530





SELECT
    (CASE
         WHEN PRICE < 10000 THEN 0
         ELSE TRUNCATE(PRICE, -4)
         END)                AS PRICE_GROUP,
    COUNT(PRODUCT_ID)       AS PRODUCTS

FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP;


TRUNCATE(숫자, 버림 할 자리수)
