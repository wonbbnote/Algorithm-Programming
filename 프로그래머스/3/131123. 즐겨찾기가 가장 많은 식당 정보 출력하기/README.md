# \[level 3] 즐겨찾기가 가장 많은 식당 정보 출력하기 - 131123

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/131123)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2024년 11월 30일 02:12:48

### 문제 설명

다음은 식당의 정보를 담은 `REST_INFO` 테이블입니다. `REST_INFO` 테이블은 다음과 같으며 `REST_ID`, `REST_NAME`, `FOOD_TYPE`, `VIEWS`, `FAVORITES`, `PARKING_LOT`, `ADDRESS`, `TEL`은 식당 ID, 식당 이름, 음식 종류, 조회수, 즐겨찾기수, 주차장 유무, 주소, 전화번호를 의미합니다.

| Column name  | Type         | Nullable |
| ------------ | ------------ | -------- |
| REST\_ID     | VARCHAR(5)   | FALSE    |
| REST\_NAME   | VARCHAR(50)  | FALSE    |
| FOOD\_TYPE   | VARCHAR(20)  | TRUE     |
| VIEWS        | NUMBER       | TRUE     |
| FAVORITES    | NUMBER       | TRUE     |
| PARKING\_LOT | VARCHAR(1)   | TRUE     |
| ADDRESS      | VARCHAR(100) | TRUE     |
| TEL          | VARCHAR(100) | TRUE     |

***

**문제**

`REST_INFO` 테이블에서 음식종류별로 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.

***

**예시**

`REST_INFO` 테이블이 다음과 같을 때

| REST\_ID | REST\_NAME | FOOD\_TYPE | VIEWS   | FAVORITES | PARKING\_LOT | ADDRESS                | TEL           |
| -------- | ---------- | ---------- | ------- | --------- | ------------ | ---------------------- | ------------- |
| 00001    | 은돼지식당      | 한식         | 1150345 | 734       | N            | 서울특별시 중구 다산로 149       | 010-4484-8751 |
| 00002    | 하이가쯔네      | 일식         | 120034  | 112       | N            | 서울시 중구 신당동 375-21      | NULL          |
| 00003    | 따띠따띠뜨      | 양식         | 1234023 | 102       | N            | 서울시 강남구 신사동 627-3 1F   | 02-6397-1023  |
| 00004    | 스시사카우스     | 일식         | 1522074 | 230       | N            | 서울시 서울시 강남구 신사동 627-27 | 010-9394-2554 |
| 00005    | 코슌스        | 일식         | 15301   | 123       | N            | 서울특별시 강남구 언주로153길      | 010-1315-8729 |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| FOOD\_TYPE | REST\_ID | REST\_NAME | FAVORITES |
| ---------- | -------- | ---------- | --------- |
| 한식         | 00001    | 은돼지식당      | 734       |
| 일식         | 00004    | 스시사카우스     | 230       |
| 양식         | 00003    | 따띠따띠뜨      | 102       |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
