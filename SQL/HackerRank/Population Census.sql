https://www.hackerrank.com/challenges/asian-population/problem?isFullScreen=true


SELECT
    SUM(city.population)
FROM
    CITY
        INNER JOIN country ON
            city.CountryCode = country.code
WHERE
        Country.Continent = "Asia"


CITY, country 테이블의 모든 도시의 인구의 합계

continent = 'Asia'