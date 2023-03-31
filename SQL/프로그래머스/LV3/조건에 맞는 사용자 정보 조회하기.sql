https://school.programmers.co.kr/learn/courses/30/lessons/164670

-- 코드를 입력하세요
SELECT
    U.USER_ID,
    U.NICKNAME,
    CONCAT(U.CITY,' ',U.STREET_ADDRESS1,' ',U.STREET_ADDRESS2,'') 전체주소,
    CONCAT(LEFT(U.TLNO, 3), '-', MID(TLNO, 4, 4), '-', RIGHT(TLNO, 4)) AS 전화번호
FROM USED_GOODS_BOARD B
         INNER JOIN USED_GOODS_USER U ON U.USER_ID = B.WRITER_ID
GROUP BY U.USER_ID
HAVING COUNT(U.USER_ID) >=3
ORDER BY  U.USER_ID DESC
;

서브쿼리 사용 안하고 INNER JOIN 으로 가져오기.
    분명 데이터 다 가지고 오고 확인했을때 아무리봐도 이상없는데 .      STREET_ADDRESS1,'' <<  여기서  ' ' 가 아니라 틀림.
    이것때문에 초기화해서 다시 2번더 풀어봄 ;


서브 쿼리를 사용.
-- 코드를 입력하세요
SELECT USER_ID, NICKNAME,
       CONCAT(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) '전체주소',
        CONCAT(LEFT(TLNO, 3), '-', MID(TLNO, 4, 4), '-', RIGHT(TLNO,4)) '전화번호'
FROM USED_GOODS_USER
WHERE USER_ID IN (SELECT WRITER_ID
                  FROM USED_GOODS_BOARD
                  GROUP BY WRITER_ID
                  HAVING COUNT(WRITER_ID) >= 3)
ORDER BY USER_ID DESC;


