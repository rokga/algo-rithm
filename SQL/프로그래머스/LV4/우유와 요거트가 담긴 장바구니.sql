https://school.programmers.co.kr/learn/courses/30/lessons/62284


    -- 코드를 입력하세요
SELECT
    DISTINCT CART_ID
FROM    CART_PRODUCTS
WHERE CART_ID IN( SELECT CART_ID
                  FROM CART_PRODUCTS
                  WHERE NAME LIKE '%Milk' OR NAME LIKE '%Yogurt'
                  GROUP BY CART_ID
                  HAVING COUNT(DISTINCT NAME) >= 2 )
ORDER BY CART_ID
;

WHERE절 서브쿼리 사용, 처음에 데이터는 나오는데 정답이 아니라고 나오길레,, 다시보다가 DISTINCT(중복)를 안넣어줘서 문제였다.