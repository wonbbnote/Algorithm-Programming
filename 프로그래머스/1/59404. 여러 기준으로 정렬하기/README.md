# \[level 1] 여러 기준으로 정렬하기 - 59404

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59404)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2024년 12월 13일 07:41:27

### 문제 설명

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. `ANIMAL_INS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `INTAKE_CONDITION`, `NAME`, `SEX_UPON_INTAKE`는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

| NAME              | TYPE       | NULLABLE |
| ----------------- | ---------- | -------- |
| ANIMAL\_ID        | VARCHAR(N) | FALSE    |
| ANIMAL\_TYPE      | VARCHAR(N) | FALSE    |
| DATETIME          | DATETIME   | FALSE    |
| INTAKE\_CONDITION | VARCHAR(N) | FALSE    |
| NAME              | VARCHAR(N) | TRUE     |
| SEX\_UPON\_INTAKE | VARCHAR(N) | FALSE    |

동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 단, 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.

**예시**

예를 들어, `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL\_ID | ANIMAL\_TYPE | DATETIME            | INTAKE\_CONDITION | NAME  | SEX\_UPON\_INTAKE |
| ---------- | ------------ | ------------------- | ----------------- | ----- | ----------------- |
| A349996    | Cat          | 2018-01-22 14:32:00 | Normal            | Sugar | Neutered Male     |
| A350276    | Cat          | 2017-08-13 13:50:00 | Normal            | Jewel | Spayed Female     |
| A396810    | Dog          | 2016-08-22 16:13:00 | Injured           | Raven | Spayed Female     |
| A410668    | Cat          | 2015-11-19 13:41:00 | Normal            | Raven | Spayed Female     |

1. 이름을 사전 순으로 정렬하면 다음과 같으며, 'Jewel', 'Raven', 'Sugar'
2. 'Raven'이라는 이름을 가진 개와 고양이가 있으므로, 이 중에서는 보호를 나중에 시작한 개를 먼저 조회합니다.

따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

| ANIMAL\_ID | NAME  | DATETIME            |
| ---------- | ----- | ------------------- |
| A350276    | Jewel | 2017-08-13 13:50:00 |
| A396810    | Raven | 2016-08-22 16:13:00 |
| A410668    | Raven | 2015-11-19 13:41:00 |
| A349996    | Sugar | 2018-01-22 14:32:00 |

***

본 문제는 [Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"](https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes)에서 제공하는 데이터를 사용하였으며 [ODbL](https://opendatacommons.org/licenses/odbl/1.0/)의 적용을 받습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
