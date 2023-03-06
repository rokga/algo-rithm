https://www.hackerrank.com/challenges/draw-the-triangle-1/problem?isFullScreen=true

SET @number = 21;
SELECT REPEAT('* ', @number := @number - 1)
FROM information_schema.tables LIMIT 20;




SET @number = 21을 하는 이유는 21-1로 select구문이 시작되어 첫번째 별들이 20개가 나오게하기
REPEAT을 사용해서 21에서 1씩 빼기
