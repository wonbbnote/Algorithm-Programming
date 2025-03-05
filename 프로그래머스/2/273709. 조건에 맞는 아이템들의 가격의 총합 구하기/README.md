# \[level 2] 조건에 맞는 아이템들의 가격의 총합 구하기 - 273709

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/273709)

### 성능 요약

메모리: undefined, 시간:

### 구분

코딩테스트 연습 > SUM， MAX， MIN

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2024년 12월 02일 19:16:14

### 문제 설명

다음은 어느 한 게임에서 사용되는 아이템들의 아이템 정보를 담은 `ITEM_INFO` 테이블입니다. `ITEM_INFO` 테이블은 다음과 같으며, `ITEM_ID`, `ITEM_NAME`, `RARITY`, `PRICE`는 각각 아이템 ID, 아이템 명, 아이템의 희귀도, 아이템의 가격을 나타냅니다.

| Column name | Type       | Nullable |
| ----------- | ---------- | -------- |
| ITEM\_ID    | INTEGER    | FALSE    |
| ITEM\_NAME  | VARCHAR(N) | FALSE    |
| RARITY      | INTEGER    | FALSE    |
| PRICE       | INTEGER    | FALSE    |

***

**문제**

`ITEM_INFO` 테이블에서 희귀도가 'LEGEND'인 아이템들의 가격의 총합을 구하는 SQL문을 작성해 주세요. 이때 컬럼명은 'TOTAL\_PRICE'로 지정해 주세요.

***

**예시**

예를 들어 `ITEM_INFO` 테이블이 다음과 같다면

| ITEM\_ID | ITEM\_NAME | RARITY | PRICE |
| -------- | ---------- | ------ | ----- |
| 0        | ITEM\_A    | COMMON | 10000 |
| 1        | ITEM\_B    | LEGEND | 9000  |
| 2        | ITEM\_C    | LEGEND | 11000 |
| 3        | ITEM\_D    | UNIQUE | 10000 |
| 4        | ITEM\_E    | LEGEND | 12000 |

조건에 해당되는 아이템의 아이템 ID는 1, 2, 4이며 각 아이템들의 가격은 9000, 11000, 12000 이므로 조건에 해당되는 아이템들의 가격의 합은 다음과 같습니다.

| TOTAL\_PRICE |
| ------------ |
| 32000        |

***

※ 참고: 본 문제는 제출 내역 확인 기능을 지원하지 않습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
