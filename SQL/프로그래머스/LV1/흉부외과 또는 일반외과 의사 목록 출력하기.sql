https://school.programmers.co.kr/learn/courses/30/lessons/132203



SELECT
    DR_NAME,
    DR_ID,
    MCDP_CD,
    DATE_FORMAT(HIRE_YMD,'%Y-%m-%d') AS HIRE_YMD

FROM
    DOCTOR
WHERE
        MCDP_CD = 'CS' OR MCDP_CD = 'GS'

ORDER BY HIRE_YMD DESC,DR_NAME ASC
;


DATE_FORMAT 사용해서 날짜 포맷 예시랑 형식 맞추기
    %M 으로 했더니 Mar/3 로 변경되서 잠깐 당황