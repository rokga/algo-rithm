https://school.programmers.co.kr/learn/courses/30/lessons/132201



SELECT
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    IFNULL(TLNO,'NONE') AS TLNO
FROM
    PATIENT
WHERE
        AGE <= 12
  AND GEND_CD = 'W'
ORDER BY AGE DESC , PT_NAME ASC
;


이때 전화번호가 없는 경우, 'NONE'으로 출력시켜 주시고,
    CASE를 사용할까 하다가 함수가 따로있는거 같아 찾아보니
    NVL (a,'b') 가 있어서 사용했는데 Oracle 이라서 프로그래머스 오류;

    ISNULL(a,'b') 을 이용해서 NULL 일때 'b'로 반환 으로 해결

