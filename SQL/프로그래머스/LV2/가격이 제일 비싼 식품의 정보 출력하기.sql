https://school.programmers.co.kr/learn/courses/30/lessons/131115



    -- 코드를 입력하세요
SELECT
    *
FROM
    FOOD_PRODUCT

ORDER BY PRICE DESC LIMIT 1;

;


처음에는
SELECT
    PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, MAX(PRICE) AS PRICE
FROM FOOD_PRODUCT

를 사용했는데 답이 안나오길레 확인해보니까

PRICE를 그룹함수로 지정된거라 나머지 SELECT 컬럼들 모두다 GROUP BY 로 지정 해줘야 하는 오류가 있엇다.

