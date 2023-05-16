https://school.programmers.co.kr/learn/courses/30/lessons/133027


 1. UNION ALL

    # 7월 아이스크림 총 주문량  과 상반기의 아이스크림 총 주문량을 더한 값
# 큰 순서대로 상위 3개의 맛을 조회.

-- 코드를 입력하세요
SELECT FLAVOR
FROM (
        SELECT FLAVOR, TOTAL_ORDER
        FROM FIRST_HALF
        UNION ALL
        SELECT FLAVOR, TOTAL_ORDER
        FROM JULY
    ) t1

GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
LIMIT 3

--  두개의 테이블이 같은 조건을 가짐 >> unionall을 사용해서 중복 제거 후 SUM

2. WITH 절 + UNION ALL

WITH t1 AS (
            SELECT *
            FROM FIRST_HALF
            UNION ALL
            SELECT *
            FROM JULY
            )

SELECT FLAVOR
FROM t1
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
LIMIT 3