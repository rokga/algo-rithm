https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true



SELECT
        salary*months AS earnings,
        count(*)
FROM
    employee
GROUP BY earnings

HAVING earnings = (SELECT MAX(salary*months)
                   FROM employee)
;

SELECT salary * months AS earnings,
       count(*)
FROM    employee
GROUP BY earnings
ORDER BY earnings DESC LIMIT 1
;


서브쿼리를 이용해서 MAX값 하나만 가져오기는걸로 사용 해봤고,
밑에는 서브쿼리 없이 그룹화 이후에 내림차순을 이용해서 제일 위에 값 하나만 리밋해서 값을 도출.