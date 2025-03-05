# \[level 2] 루시와 엘라 찾기 - 59046

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59046)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > String， Date

### 채점결과

Empty

### 제출 일자

2024년 12월 22일 13:40:17

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

동물 보호소에 들어온 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty인 동물의 아이디와 이름, 성별 및 중성화 여부를 조회하는 SQL 문을 작성해주세요.

**예시**

이때 결과는 아이디 순으로 조회해주세요. 예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL\_ID | ANIMAL\_TYPE | DATETIME            | INTAKE\_CONDITION | NAME  | SEX\_UPON\_INTAKE |
| ---------- | ------------ | ------------------- | ----------------- | ----- | ----------------- |
| A373219    | Cat          | 2014-07-29 11:43:00 | Normal            | Ella  | Spayed Female     |
| A377750    | Dog          | 2017-10-25 17:17:00 | Normal            | Lucy  | Spayed Female     |
| A353259    | Dog          | 2016-05-08 12:57:00 | Injured           | Bj    | Neutered Male     |
| A354540    | Cat          | 2014-12-11 11:48:00 | Normal            | Tux   | Neutered Male     |
| A354597    | Cat          | 2014-05-02 12:16:00 | Normal            | Ariel | Spayed Female     |

SQL문을 실행하면 다음과 같이 나와야 합니다.

| ANIMAL\_ID | NAME | SEX\_UPON\_INTAKE |
| ---------- | ---- | ----------------- |
| A373219    | Ella | Spayed Female     |
| A377750    | Lucy | Spayed Female     |

***

본 문제는 [Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"](https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes)에서 제공하는 데이터를 사용하였으며 [ODbL](https://opendatacommons.org/licenses/odbl/1.0/)의 적용을 받습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
