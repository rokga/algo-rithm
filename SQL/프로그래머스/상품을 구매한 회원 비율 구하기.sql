https://school.programmers.co.kr/learn/courses/30/lessons/131534


SELECT DATE_FORMAT(O.SALES_DATE, "%Y") AS YEAR,
        DATE_FORMAT(O.SALES_DATE, "%m")AS MONTH,
        COUNT(DISTINCT U.USER_ID) AS PUCHASED_USERS,
        ROUND(COUNT(DISTINCT U.USER_ID)/ ( SELECT COUNT(DISTINCT USER_ID)
                                            FROM USER_INFO
                                            WHERE YEAR(JOINED) = "2021%")
                                            ,1)AS PUCHASED_RATIO


FROM USER_INFO U
    JOIN ONLINE_SALE O ON U.USER_ID = O.USER_ID
WHERE U.JOINED LIKE "2021%"
GROUP BY MONTH
ORDER BY 1,2

-- 서브쿼리를 이용해서 중복되는 값 구해서 ROUND를 이용해서 소수 첫째 자리에서 반올림.
