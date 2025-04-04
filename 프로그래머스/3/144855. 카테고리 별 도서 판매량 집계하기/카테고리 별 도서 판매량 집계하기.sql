-- 코드를 입력하세요
SELECT CATEGORY, SUM(s.SALES) AS TOTAL_SALES
FROM BOOK_SALES s JOIN BOOK b ON b.BOOK_ID = s.BOOK_ID
WHERE YEAR(SALES_DATE) = "2022" AND MONTH(SALES_DATE) = "01"
GROUP BY CATEGORY
ORDER BY CATEGORY