https://school.programmers.co.kr/learn/courses/30/lessons/131537


    -- 코드를 입력하세요
(SELECT DATE_FORMAT(SALES_DATE,"%Y-%m-%d") AS SALES_DATE,
        PRODUCT_ID,
        USER_ID,
        SALES_AMOUNT
FROM    ONLINE_SALE
WHERE SALES_DATE BETWEEN DATE("2022-03-01") AND DATE("2022-03-31")
 UNION
 SELECT DATE_FORMAT(SALES_DATE,'%Y-%m-%d') AS SALES_DATE,
        PRODUCT_ID,
        NULL AS USER_ID,
        SALES_AMOUNT
FROM    OFFLINE_SALE
WHERE SALES_DATE BETWEEN DATE("2022-03-01") AND DATE("2022-03-31"))
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID



*** UNION 에 대해서 한번 정리도 하면서 문제를 풀어봄.

    문제자체가 online 과 offline의 조건이 같아서, user_id 만 null로 해결 하고 합쳐버렸다.

