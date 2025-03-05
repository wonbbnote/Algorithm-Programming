# \[level 2] 조건에 부합하는 중고거래 상태 조회하기 - 164672

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164672)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > String， Date

### 채점결과

Empty

### 제출 일자

2024년 11월 29일 21:42:41

### 문제 설명

다음은 중고거래 게시판 정보를 담은 `USED_GOODS_BOARD` 테이블입니다. `USED_GOODS_BOARD` 테이블은 다음과 같으며 `BOARD_ID`, `WRITER_ID`, `TITLE`, `CONTENTS`, `PRICE`, `CREATED_DATE`, `STATUS`, `VIEWS`은 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.

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

***

**문제**

`USED_GOODS_BOARD` 테이블에서 2022년 10월 5일에 등록된 중고거래 게시물의 게시글 ID, 작성자 ID, 게시글 제목, 가격, 거래상태를 조회하는 SQL문을 작성해주세요. 거래상태가 SALE 이면 판매중, RESERVED이면 예약중, DONE이면 거래완료 분류하여 출력해주시고, 결과는 게시글 ID를 기준으로 내림차순 정렬해주세요.

***

**예시**

`USED_GOODS_BOARD` 테이블이 다음과 같을 때

| BOARD\_ID | WRITER\_ID | TITLE     | CONTENTS                  | PRICE | CREATED\_DATE | STATUS | VIEWS |
| --------- | ---------- | --------- | ------------------------- | ----- | ------------- | ------ | ----- |
| B0007     | s2s2123    | 커피글라인더    | 새상품처럼 깨끗합니다.              | 7000  | 2022-10-04    | DONE   | 210   |
| B0008     | hong02     | 자전거 판매합니다 | 출퇴근용으로 구매했다가 사용하지 않아서 내놔요 | 40000 | 2022-10-04    | SALE   | 301   |
| B0009     | yawoong67  | 선반 팝니다    | 6단 선반. 환불 반품 안됩니다.        | 12000 | 2022-10-05    | DONE   | 202   |
| B0010     | keel1990   | 철제선반5단    | 철제선반 5단 조립식 팜             | 10000 | 2022-10-05    | SALE   | 194   |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| BOARD\_ID | WRITER\_ID | TITLE  | PRICE | STATUS |
| --------- | ---------- | ------ | ----- | ------ |
| B0010     | keel1990   | 철제선반5단 | 10000 | 판매중    |
| B0009     | yawoong67  | 선반 팝니다 | 12000 | 거래완료   |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
