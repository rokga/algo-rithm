https://school.programmers.co.kr/learn/courses/30/lessons/131120




    -- 코드를 입력하세요
SELECT
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') AS DATE_OF_BIRTH
FROM
    MEMBER_PROFILE
WHERE
    MONTH(DATE_OF_BIRTH) = 3 AND GENDER = 'W'AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC;


햇갈리는 부분.
    DATE_FORMAT 에서 %Y 가 대문자 해야 2023 나온다.