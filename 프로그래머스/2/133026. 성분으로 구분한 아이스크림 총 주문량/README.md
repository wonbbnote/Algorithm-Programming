# \[level 2] 성분으로 구분한 아이스크림 총 주문량 - 133026

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/133026)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2024년 11월 30일 01:46:20

### 문제 설명

다음은 아이스크림 가게의 상반기 주문 정보를 담은 `FIRST_HALF` 테이블과 아이스크림 성분에 대한 정보를 담은 `ICECREAM_INFO` 테이블입니다. `FIRST_HALF` 테이블 구조는 다음과 같으며, `SHIPMENT_ID`, `FLAVOR`, `TOTAL_ORDER` 는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다. `FIRST_HALF` 테이블의 기본 키는 `FLAVOR`입니다.

| NAME         | TYPE       | NULLABLE |
| ------------ | ---------- | -------- |
| SHIPMENT\_ID | INT(N)     | FALSE    |
| FLAVOR       | VARCHAR(N) | FALSE    |
| TOTAL\_ORDER | INT(N)     | FALSE    |

`ICECREAM_INFO` 테이블 구조는 다음과 같으며, `FLAVOR`, `INGREDITENT_TYPE` 은 각각 아이스크림 맛, 아이스크림의 성분 타입을 나타냅니다. `INGREDIENT_TYPE`에는 아이스크림의 주 성분이 설탕이면 `sugar_based`라고 입력되고, 아이스크림의 주 성분이 과일이면 `fruit_based`라고 입력됩니다. `ICECREAM_INFO`의 기본 키는 `FLAVOR`입니다. `ICECREAM_INFO`테이블의 `FLAVOR`는 `FIRST_HALF` 테이블의 `FLAVOR`의 외래 키입니다.

| NAME             | TYPE       | NULLABLE |
| ---------------- | ---------- | -------- |
| FLAVOR           | VARCHAR(N) | FALSE    |
| INGREDIENT\_TYPE | VARCHAR(N) | FALSE    |

***

**문제**

상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요. 이때 총주문량을 나타내는 컬럼명은 TOTAL\_ORDER로 지정해주세요.

***

**예시**

예를 들어 `FIRST_HALF` 테이블이 다음과 같고

| SHIPMENT\_ID | FLAVOR           | TOTAL\_ORDER |
| ------------ | ---------------- | ------------ |
| 101          | chocolate        | 3200         |
| 102          | vanilla          | 2800         |
| 103          | mint\_chocolate  | 1700         |
| 104          | caramel          | 2600         |
| 105          | white\_chocolate | 3100         |
| 106          | peach            | 2450         |
| 107          | watermelon       | 2150         |
| 108          | mango            | 2900         |
| 109          | strawberry       | 3100         |
| 110          | melon            | 3150         |
| 111          | orange           | 2900         |
| 112          | pineapple        | 2900         |

`ICECREAM_INFO` 테이블이 다음과 같다면

| FLAVOR           | INGREDIENT\_TYPE |
| ---------------- | ---------------- |
| chocolate        | sugar\_based     |
| vanilla          | sugar\_based     |
| mint\_chocolate  | sugar\_based     |
| caramel          | sugar\_based     |
| white\_chocolate | sugar\_based     |
| peach            | fruit\_based     |
| watermelon       | fruit\_based     |
| mango            | fruit\_based     |
| strawberry       | fruit\_based     |
| melon            | fruit\_based     |
| orange           | fruit\_based     |
| pineapple        | fruit\_based     |

상반기에 아이스크림의 주 성분이 설탕인 아이스크림들에 대한 총주문량을 구하면 3,200 + 2,800 + 1,700 + 2,600 + 3,100 = 13,400입니다. 아이스크림의 주 성분이 과일인 아이스크림들에 대한 총주문량을 구하면 3,100 + 2,450 + 2,150 + 2,900 + 3,150 + 2,900 + 2,900 = 19,550입니다. 따라서 총주문량이 작은 순서대로 조회하는 SQL 문을 실행하면 다음과 같이 나와야 합니다.

| INGREDIENT\_TYPE | TOTAL\_ORDER |
| ---------------- | ------------ |
| sugar\_based     | 13400        |
| fruit\_based     | 19550        |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
