https://school.programmers.co.kr/learn/courses/30/lessons/132204



    -- 코드를 입력하세요
SELECT
    A.APNT_NO,
    P.PT_NAME,
    P.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
FROM APPOINTMENT A
         JOIN PATIENT P ON P.PT_NO = A.PT_NO
         JOIN DOCTOR D ON D.DR_ID = A.MDDR_ID
WHERE A.MCDP_CD = 'CS' AND A.APNT_YMD LIKE "%2022-04-13%" AND A.APNT_CNCL_YN = "N"
ORDER BY A.APNT_YMD


