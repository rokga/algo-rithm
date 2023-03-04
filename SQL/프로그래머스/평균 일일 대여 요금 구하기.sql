SELECT
    ROUND(AVG(daily_fee)) AS AVERAGE_FEE
FROM
    CAR_RENTAL_COMPANY_CAR

WHERE
    CAR_TYPE = 'SUV'
;

// AVG로 평균을 구하고, ROUND로 소수 첫째자리에서 반올림

