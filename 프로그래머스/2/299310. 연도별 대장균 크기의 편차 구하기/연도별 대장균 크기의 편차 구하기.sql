SELECT m.YEAR AS YEAR, (m.MAX - e.SIZE_OF_COLONY) AS YEAR_DEV, ID
FROM ECOLI_DATA e JOIN 
(
SELECT MAX(SIZE_OF_COLONY) AS MAX, YEAR(DIFFERENTIATION_DATE) AS YEAR
FROM ECOLI_DATA
GROUP BY YEAR(DIFFERENTIATION_DATE)
) AS m
ON YEAR(e.DIFFERENTIATION_DATE) = m.YEAR
ORDER BY YEAR, YEAR_DEV