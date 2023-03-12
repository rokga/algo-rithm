https://school.programmers.co.kr/learn/courses/30/lessons/59041


SELECT
    NAME, COUNT(NAME) AS COUNT
FROM
    ANIMAL_INS
GROUP BY NAME
HAVING COUNT > 1  AND NAME IS NOT NULL
ORDER BY NAME;




HAVING
HAVING 절은 해석상 WHERE 절과 동일하다. 단 조건 내용에 그룹 함수를 포함하는 것만을 포함한다.
HAVING 절은 GROUP BY 절 뒤에 기술한다.
HAVING 절의 조건은 그룹 함수를 포함해야 한다.