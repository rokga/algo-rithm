https://school.programmers.co.kr/learn/courses/30/lessons/164671



    -- 코드를 입력하세요
SELECT
    CONCAT('/home/grep/src/',B.BOARD_ID,'/',F.FILE_ID,F.FILE_NAME,F.FILE_EXT)
        AS FILE_PATH
FROM
    (SELECT *
     FROM USED_GOODS_BOARD
     ORDER BY VIEWS DESC
         LIMIT 1) B
        LEFT JOIN USED_GOODS_FILE F ON B.BOARD_ID = F.BOARD_ID
ORDER BY F.FILE_ID DESC
;


