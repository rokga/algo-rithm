https://school.programmers.co.kr/learn/courses/30/lessons/131535


USER_INFO 테이블에서 2021년에 가입한 회원 중 나이가 20세 이상 29세 이하인 회원이 몇 명인지 출력하는 SQL문을 작성해주세요.

SELECT
    count(user_id) AS USER_ID
FROM
    USER_INFO
WHERE
           AGE >= BETWEEN 20 AND 29
        AND YEAR(JOINED) = '2021'
;


JOINED = 2021   >> YEAR(JOINED) = '2021'

20세이상 29세이하  >> BETWEEN 20 AND 29