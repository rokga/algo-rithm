https://school.programmers.co.kr/learn/courses/30/lessons/59413


-- 코드를 입력하세요
SELECT
    HOUR(DATETIME)
FROM  ANIMAL_OUTS
GROUP BY 1
ORDER BY 1


 ------------------------------------------------
난처음에 문제를 보고 일단 * 으로 데이터값을 다불러와서 하나씩 생각을 하게 됐다.
처음에는 위처럼 필터를 해보니 0~23 시간중에 테이블이 없어서 임시로 만들어 줘야한다ㅠ
찾아보니 WITH 문 과  RECURSIVE 를 이용하여 해결 하는방법을 찾음


WITH RECURSIVE a AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR+1 FROM a WHERE HOUR < 23) , b AS
            (SELECT HOUR(DATETIME) AS HOUR,
                COUNT(ANIMAL_ID) AS COUNT
            FROM ANIMAL_OUTS
            GROUP BY HOUR
            )

SELECT a.HOUR,      -- 0 ~23 까지의 데이터
       CASE WHEN b.COUNT IS NULL THEN 0 ELSE COUNT END AS COUNT  --  null >>0  else >> count값
FROM a
LEFT JOIN b ON a.HOUR = b.HOUR
ORDER BY a.HOUR
