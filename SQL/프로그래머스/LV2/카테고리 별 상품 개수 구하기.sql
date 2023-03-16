https://school.programmers.co.kr/learn/courses/30/lessons/131529




    -- 코드를 입력하세요
SELECT  SUBSTRING(PRODUCT_CODE,1,2) AS CATEGORY,
        COUNT(*)

FROM    PRODUCT
GROUP BY CATEGORY
ORDER BY PRODUCT_CODE
;




상품 카테고리에서 앞2글자를 추출하기. (SUBSTRING , LEFT , RIGHT  ) 함수 사용.
    SUBSTRING('문자열', '시작지점')
    SUBSTRING('문자열', '시작지점', '길이')
    LEFT('문자열','길이')
    LIGHT('문자열','길이')