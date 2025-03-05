# \[level 4] 오프라인/온라인 판매 데이터 통합하기 - 131537

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131537)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2024년 12월 28일 15:44:20

### 문제 설명

다음은 어느 의류 쇼핑몰의 온라인 상품 판매 정보를 담은 `ONLINE_SALE` 테이블과 오프라인 상품 판매 정보를 담은 `OFFLINE_SALE` 테이블 입니다. `ONLINE_SALE` 테이블은 아래와 같은 구조로 되어있으며 `ONLINE_SALE_ID`, `USER_ID`, `PRODUCT_ID`, `SALES_AMOUNT`, `SALES_DATE`는 각각 온라인 상품 판매 ID, 회원 ID, 상품 ID, 판매량, 판매일을 나타냅니다.

| Column name      | Type    | Nullable |
| ---------------- | ------- | -------- |
| ONLINE\_SALE\_ID | INTEGER | FALSE    |
| USER\_ID         | INTEGER | FALSE    |
| PRODUCT\_ID      | INTEGER | FALSE    |
| SALES\_AMOUNT    | INTEGER | FALSE    |
| SALES\_DATE      | DATE    | FALSE    |

동일한 날짜, 회원 ID, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.

`OFFLINE_SALE` 테이블은 아래와 같은 구조로 되어있으며 `OFFLINE_SALE_ID`, `PRODUCT_ID`, `SALES_AMOUNT`, `SALES_DATE`는 각각 오프라인 상품 판매 ID, 상품 ID, 판매량, 판매일을 나타냅니다.

| Column name       | Type    | Nullable |
| ----------------- | ------- | -------- |
| OFFLINE\_SALE\_ID | INTEGER | FALSE    |
| PRODUCT\_ID       | INTEGER | FALSE    |
| SALES\_AMOUNT     | INTEGER | FALSE    |
| SALES\_DATE       | DATE    | FALSE    |

동일한 날짜, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.

***

**문제**

`ONLINE_SALE` 테이블과 `OFFLINE_SALE` 테이블에서 2022년 3월의 오프라인/온라인 상품 판매 데이터의 판매 날짜, 상품ID, 유저ID, 판매량을 출력하는 SQL문을 작성해주세요. `OFFLINE_SALE` 테이블의 판매 데이터의 `USER_ID` 값은 NULL 로 표시해주세요. 결과는 판매일을 기준으로 오름차순 정렬해주시고 판매일이 같다면 상품 ID를 기준으로 오름차순, 상품ID까지 같다면 유저 ID를 기준으로 오름차순 정렬해주세요.

***

**예시**

예를 들어 `ONLINE_SALE` 테이블이 다음과 같고

| ONLINE\_SALE\_ID | USER\_ID | PRODUCT\_ID | SALES\_AMOUNT | SALES\_DATE |
| ---------------- | -------- | ----------- | ------------- | ----------- |
| 1                | 1        | 3           | 2             | 2022-02-25  |
| 2                | 4        | 4           | 1             | 2022-03-01  |
| 4                | 2        | 2           | 2             | 2022-03-02  |
| 3                | 6        | 3           | 3             | 2022-03-02  |
| 5                | 5        | 5           | 1             | 2022-03-03  |
| 6                | 5        | 7           | 1             | 2022-04-06  |

`OFFLINE_SALE` 테이블이 다음과 같다면

| OFFLINE\_SALE\_ID | PRODUCT\_ID | SALES\_AMOUNT | SALES\_DATE |
| ----------------- | ----------- | ------------- | ----------- |
| 1                 | 1           | 2             | 2022-02-21  |
| 4                 | 1           | 2             | 2022-03-01  |
| 3                 | 3           | 3             | 2022-03-01  |
| 2                 | 4           | 1             | 2022-03-01  |
| 5                 | 2           | 1             | 2022-03-03  |
| 6                 | 2           | 1             | 2022-04-01  |

각 테이블의 2022년 3월의 판매 데이터를 합쳐서, 정렬한 결과는 다음과 같아야 합니다.

| SALES\_DATE | PRODUCT\_ID | USER\_ID | SALES\_AMOUNT |
| ----------- | ----------- | -------- | ------------- |
| 2022-03-01  | 1           | NULL     | 2             |
| 2022-03-01  | 3           | NULL     | 3             |
| 2022-03-01  | 4           | NULL     | 1             |
| 2022-03-01  | 4           | 4        | 1             |
| 2022-03-02  | 2           | 2        | 2             |
| 2022-03-02  | 3           | 6        | 3             |
| 2022-03-03  | 2           | NULL     | 1             |
| 2022-03-03  | 5           | 5        | 1             |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
