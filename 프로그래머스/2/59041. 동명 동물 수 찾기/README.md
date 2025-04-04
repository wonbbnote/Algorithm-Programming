# \[level 2] 동명 동물 수 찾기 - 59041

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59041)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

Empty

### 제출 일자

2024년 11월 30일 02:36:10

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

동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요. 이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.

**예시**

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL\_ID | ANIMAL\_TYPE | DATETIME            | INTAKE\_CONDITION | NAME   | SEX\_UPON\_INTAKE |
| ---------- | ------------ | ------------------- | ----------------- | ------ | ----------------- |
| A396810    | Dog          | 2016-08-22 16:13:00 | Injured           | Raven  | Spayed Female     |
| A377750    | Dog          | 2017-10-25 17:17:00 | Normal            | Lucy   | Spayed Female     |
| A355688    | Dog          | 2014-01-26 13:48:00 | Normal            | Shadow | Neutered Male     |
| A399421    | Dog          | 2015-08-25 14:08:00 | Normal            | Lucy   | Spayed Female     |
| A400680    | Dog          | 2017-06-17 13:29:00 | Normal            | Lucy   | Spayed Female     |
| A410668    | Cat          | 2015-11-19 13:41:00 | Normal            | Raven  | Spayed Female     |

* Raven 이름은 2번 쓰였습니다.
* Lucy 이름은 3번 쓰였습니다
* Shadow 이름은 1번 쓰였습니다.

따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

| NAME  | COUNT |
| ----- | ----- |
| Lucy  | 3     |
| Raven | 2     |

***

본 문제는 [Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"](https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes)에서 제공하는 데이터를 사용하였으며 [ODbL](https://opendatacommons.org/licenses/odbl/1.0/)의 적용을 받습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
