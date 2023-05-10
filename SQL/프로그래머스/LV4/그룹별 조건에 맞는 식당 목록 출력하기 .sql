https://school.programmers.co.kr/learn/courses/30/lessons/131124



    -- 코드를 입력하세요
SELECT  M.MEMBER_NAME,
        R.REVIEW_TEXT,
        DATE_FORMAT(R.REVIEW_DATE,'%Y-%m-%d')

FROM    MEMBER_PROFILE M
            JOIN    REST_REVIEW R ON R.MEMBER_ID = M.MEMBER_ID
WHERE   M.MEMBER_NAME = ( SELECT P.MEMBER_NAME
                          FROM    MEMBER_PROFILE P
                          JOIN  REST_REVIEW W ON P.MEMBER_ID = W.MEMBER_ID
                          GROUP BY MEMBER_NAME
                          ORDER BY COUNT(MEMBER_NAME) DESC
                        LIMIT 1)
ORDER BY R.REVIEW_DATE ,R.REVIEW_TEXT