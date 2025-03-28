# \[level 3] 있었는데요 없었습니다 - 59043

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59043)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > JOIN

### 채점결과

Empty

### 제출 일자

2024년 11월 29일 20:32:14

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

`ANIMAL_OUTS` 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블입니다. `ANIMAL_OUTS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `NAME`, `SEX_UPON_OUTCOME`는 각각 동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부를 나타냅니다. `ANIMAL_OUTS` 테이블의 `ANIMAL_ID`는 `ANIMAL_INS`의 `ANIMAL_ID`의 외래 키입니다.

| NAME               | TYPE       | NULLABLE |
| ------------------ | ---------- | -------- |
| ANIMAL\_ID         | VARCHAR(N) | FALSE    |
| ANIMAL\_TYPE       | VARCHAR(N) | FALSE    |
| DATETIME           | DATETIME   | FALSE    |
| NAME               | VARCHAR(N) | TRUE     |
| SEX\_UPON\_OUTCOME | VARCHAR(N) | FALSE    |

관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다. 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.

**예시**

예를 들어, `ANIMAL_INS` 테이블과 `ANIMAL_OUTS` 테이블이 다음과 같다면

`ANIMAL_INS`

| ANIMAL\_ID | ANIMAL\_TYPE | DATETIME            | INTAKE\_CONDITION | NAME     | SEX\_UPON\_INTAKE |
| ---------- | ------------ | ------------------- | ----------------- | -------- | ----------------- |
| A350276    | Cat          | 2017-08-13 13:50:00 | Normal            | Jewel    | Spayed Female     |
| A381217    | Dog          | 2017-07-08 09:41:00 | Sick              | Cherokee | Neutered Male     |

`ANIMAL_OUTS`

| ANIMAL\_ID | ANIMAL\_TYPE | DATETIME            | NAME     | SEX\_UPON\_OUTCOME |
| ---------- | ------------ | ------------------- | -------- | ------------------ |
| A350276    | Cat          | 2018-01-28 17:51:00 | Jewel    | Spayed Female      |
| A381217    | Dog          | 2017-06-09 18:51:00 | Cherokee | Neutered Male      |

SQL문을 실행하면 다음과 같이 나와야 합니다.

| ANIMAL\_ID | NAME     |
| ---------- | -------- |
| A381217    | Cherokee |

***

본 문제는 [Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"](https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes)에서 제공하는 데이터를 사용하였으며 [ODbL](https://opendatacommons.org/licenses/odbl/1.0/)의 적용을 받습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
