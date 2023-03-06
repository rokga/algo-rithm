https://www.hackerrank.com/challenges/draw-the-triangle-2/problem?isFullScreen=true


SET @number = 0;
SELECT REPEAT('* ', @number := @number + 1)
FROM information_schema.tables LIMIT 20;



 1 이랑 반대로 0부터 시작해서 20까지 반족해서 증가 시키기.