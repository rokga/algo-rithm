https://school.programmers.co.kr/learn/courses/30/lessons/131536



SELECT
    USER_ID,
    PRODUCT_ID
FROM ONLINE_SALE
GROUP BY 1 , 2
HAVING COUNT(USER_ID) > 1
ORDER BY 1,2 DESC
;
