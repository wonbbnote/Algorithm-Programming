# \[level 3] 조건에 맞는 사용자와 총 거래금액 조회하기 - 164668

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164668)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2024년 11월 30일 02:28:19

### 문제 설명

다음은 중고 거래 게시판 정보를 담은 `USED_GOODS_BOARD` 테이블과 중고 거래 게시판 사용자 정보를 담은 `USED_GOODS_USER` 테이블입니다. `USED_GOODS_BOARD` 테이블은 다음과 같으며 `BOARD_ID`, `WRITER_ID`, `TITLE`, `CONTENTS`, `PRICE`, `CREATED_DATE`, `STATUS`, `VIEWS`는 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.

| Column name   | Type          | Nullable |
| ------------- | ------------- | -------- |
| BOARD\_ID     | VARCHAR(5)    | FALSE    |
| WRITER\_ID    | VARCHAR(50)   | FALSE    |
| TITLE         | VARCHAR(100)  | FALSE    |
| CONTENTS      | VARCHAR(1000) | FALSE    |
| PRICE         | NUMBER        | FALSE    |
| CREATED\_DATE | DATE          | FALSE    |
| STATUS        | VARCHAR(10)   | FALSE    |
| VIEWS         | NUMBER        | FALSE    |

`USED_GOODS_USER` 테이블은 다음과 같으며 `USER_ID`, `NICKNAME`, `CITY`, `STREET_ADDRESS1`, `STREET_ADDRESS2`, `TLNO`는 각각 회원 ID, 닉네임, 시, 도로명 주소, 상세 주소, 전화번호를 를 의미합니다.

| Column name      | Type         | Nullable |
| ---------------- | ------------ | -------- |
| USER\_ID         | VARCHAR(50)  | FALSE    |
| NICKNAME         | VARCHAR(100) | FALSE    |
| CITY             | VARCHAR(100) | FALSE    |
| STREET\_ADDRESS1 | VARCHAR(100) | FALSE    |
| STREET\_ADDRESS2 | VARCHAR(100) | TRUE     |
| TLNO             | VARCHAR(20)  | FALSE    |

***

**문제**

`USED_GOODS_BOARD`와 `USED_GOODS_USER` 테이블에서 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회하는 SQL문을 작성해주세요. 결과는 총거래금액을 기준으로 오름차순 정렬해주세요.

***

**예시**

`USED_GOODS_BOARD` 테이블이 다음과 같고

| BOARD\_ID | WRITER\_ID | TITLE         | CONTENTS                | PRICE  | CREATED\_DATE | STATUS | VIEWS |
| --------- | ---------- | ------------- | ----------------------- | ------ | ------------- | ------ | ----- |
| B0001     | zkzkdh1    | 캠핑의자          | 가벼워요 깨끗한 상태입니다. 2개      | 25000  | 2022-11-29    | SALE   | 34    |
| B0002     | miyeon89   | 벽걸이 에어컨       | 엘지 휘센 7평                | 100000 | 2022-11-29    | SALE   | 55    |
| B0003     | dhfkzmf09  | 에어팟 맥스        | 에어팟 맥스 스카이 블루 색상 판매합니다. | 450000 | 2022-11-26    | DONE   | 67    |
| B0004     | sangjune1  | 파파야나인 포르쉐 푸쉬카 | 예민하신분은 피해주세요            | 30000  | 2022-11-30    | DONE   | 78    |
| B0005     | zkzkdh1    | 애플워치7         | 애플워치7 실버 스텐 45미리 판매합니다. | 700000 | 2022-11-30    | DONE   | 99    |

`USED_GOODS_USER` 테이블이 다음과 같을 때

| USER\_ID  | NICKNAME | CITY | STREET\_ADDRESS1 | STREET\_ADDRESS2 | TLNO        |
| --------- | -------- | ---- | ---------------- | ---------------- | ----------- |
| cjfwls91  | 점심만금식    | 성남시  | 분당구 내정로 185      | 501호             | 01036344964 |
| zkzkdh1   | 후후후      | 성남시  | 분당구 내정로 35       | 가동 1202호         | 01032777543 |
| spdlqj12  | 크크큭      | 성남시  | 분당구 수내로 206      | 2019동 801호       | 01087234922 |
| xlqpfh2   | 잉여킹      | 성남시  | 분당구 수내로 1        | 001-004          | 01064534911 |
| dhfkzmf09 | 찐찐       | 성남시  | 분당구 수내로 13       | A동 1107호         | 01053422914 |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| USER\_ID | NICKNAME | TOTAL\_SALES |
| -------- | -------- | ------------ |
| zkzkdh1  | 후후후      | 700000       |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
