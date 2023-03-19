https://school.programmers.co.kr/learn/courses/30/lessons/132202


SELECT
    MCDP_CD AS '진료과 코드',
    COUNT(APNT_YMD) AS '5월예약건수'
FROM    APPOINTMENT
WHERE  APNT_YMD like '2022-05%'
GROUP BY 1
ORDER BY 2,1
;


