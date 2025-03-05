# \[level 2] 재구매가 일어난 상품과 회원 리스트 구하기 - 131536

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131536)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2024년 12월 08일 17:04:59

### 문제 설명

다음은 어느 의류 쇼핑몰의 온라인 상품 판매 정보를 담은 `ONLINE_SALE` 테이블 입니다. `ONLINE_SALE` 테이블은 아래와 같은 구조로 되어있으며 `ONLINE_SALE_ID`, `USER_ID`, `PRODUCT_ID`, `SALES_AMOUNT`, `SALES_DATE`는 각각 온라인 상품 판매 ID, 회원 ID, 상품 ID, 판매량, 판매일을 나타냅니다.

| Column name      | Type    | Nullable |
| ---------------- | ------- | -------- |
| ONLINE\_SALE\_ID | INTEGER | FALSE    |
| USER\_ID         | INTEGER | FALSE    |
| PRODUCT\_ID      | INTEGER | FALSE    |
| SALES\_AMOUNT    | INTEGER | FALSE    |
| SALES\_DATE      | DATE    | FALSE    |

동일한 날짜, 회원 ID, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.

***

**문제**

`ONLINE_SALE` 테이블에서 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여, 재구매한 회원 ID와 재구매한 상품 ID를 출력하는 SQL문을 작성해주세요. 결과는 회원 ID를 기준으로 오름차순 정렬해주시고 회원 ID가 같다면 상품 ID를 기준으로 내림차순 정렬해주세요.

***

**예시**

예를 들어 `ONLINE_SALE` 테이블이 다음과 같다면

| ONLINE\_SALE\_ID | USER\_ID | PRODUCT\_ID | SALES\_AMOUNT | SALES\_DATE |
| ---------------- | -------- | ----------- | ------------- | ----------- |
| 1                | 1        | 3           | 2             | 2022-02-25  |
| 2                | 1        | 4           | 1             | 2022-03-01  |
| 4                | 2        | 4           | 2             | 2022-03-12  |
| 3                | 1        | 3           | 3             | 2022-03-31  |
| 5                | 3        | 5           | 1             | 2022-04-03  |
| 6                | 2        | 4           | 1             | 2022-04-06  |
| 2                | 1        | 4           | 2             | 2022-05-11  |

`USER_ID` 가 1인 유저가 `PRODUCT_ID` 가 3, 4인 상품들을 재구매하고, `USER_ID` 가 2인 유저가 `PRODUCT_ID` 가 4인 상품을 재구매 하였으므로, 다음과 같이 결과가 나와야합니다.

| USER\_ID | PRODUCT\_ID |
| -------- | ----------- |
| 1        | 4           |
| 1        | 3           |
| 2        | 4           |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
