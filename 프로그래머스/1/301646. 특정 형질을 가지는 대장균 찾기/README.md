# \[level 1] 특정 형질을 가지는 대장균 찾기 - 301646

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/301646)

### 성능 요약

메모리: undefined, 시간:

### 구분

코딩테스트 연습 > SELECT

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2024년 12월 30일 22:24:20

### 문제 설명

대장균들은 일정 주기로 분화하며, 분화를 시작한 개체를 부모 개체, 분화가 되어 나온 개체를 자식 개체라고 합니다.\
다음은 실험실에서 배양한 대장균들의 정보를 담은 `ECOLI_DATA` 테이블입니다. `ECOLI_DATA` 테이블의 구조는 다음과 같으며, `ID`, `PARENT_ID`, `SIZE_OF_COLONY`, `DIFFERENTIATION_DATE`, `GENOTYPE` 은 각각 대장균 개체의 ID, 부모 개체의 ID, 개체의 크기, 분화되어 나온 날짜, 개체의 형질을 나타냅니다.

| Column name           | Type    | Nullable |
| --------------------- | ------- | -------- |
| ID                    | INTEGER | FALSE    |
| PARENT\_ID            | INTEGER | TRUE     |
| SIZE\_OF\_COLONY      | INTEGER | FALSE    |
| DIFFERENTIATION\_DATE | DATE    | FALSE    |
| GENOTYPE              | INTEGER | FALSE    |

최초의 대장균 개체의 `PARENT_ID` 는 NULL 값입니다.

***

**문제**

2번 형질이 보유하지 않으면서 1번이나 3번 형질을 보유하고 있는 대장균 개체의 수(`COUNT`)를 출력하는 SQL 문을 작성해주세요. 1번과 3번 형질을 모두 보유하고 있는 경우도 1번이나 3번 형질을 보유하고 있는 경우에 포함합니다.

***

**예시**

예를 들어 `ECOLI_DATA` 테이블이 다음과 같다면

| ID | PARENT\_ID | SIZE\_OF\_COLONY | DIFFERENTIATION\_DATE | GENOTYPE |
| -- | ---------- | ---------------- | --------------------- | -------- |
| 1  | NULL       | 10               | 2019/01/01            | 8        |
| 2  | NULL       | 2                | 2019/01/01            | 15       |
| 3  | 2          | 100              | 2020/01/01            | 1        |
| 4  | 2          | 16               | 2020/01/01            | 13       |

각 대장균 별 형질을 2진수로 나타내면 다음과 같습니다.

ID 1 : 1000₍₂₎\
ID 2 : 1111₍₂₎\
ID 3 : 1₍₂₎\
ID 4 : 1101₍₂₎

각 대장균 별 보유한 형질을 다음과 같습니다.

ID 1 : 4\
ID 2 : 1, 2, 3, 4\
ID 3 : 1\
ID 4 : 1, 3, 4

따라서 2번 형질이 없는 대장균 개체는 ID 1, ID 3, ID 4 이며 이 중 1번이나 3번 형질을 보유한 대장균 개체는 ID 3, ID 4 입니다.

따라서 결과는 다음과 같아야 합니다.

| COUNT |
| ----- |
| 2     |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
