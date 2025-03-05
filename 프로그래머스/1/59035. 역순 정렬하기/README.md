# \[level 1] 역순 정렬하기 - 59035

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59035)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 제출 일자

2024년 12월 05일 03:51:28

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

동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 이때 결과는 ANIMAL\_ID 역순으로 보여주세요. SQL을 실행하면 다음과 같이 출력되어야 합니다.

| NAME   | DATETIME            |
| ------ | ------------------- |
| Rocky  | 2016-06-07 09:17:00 |
| Shelly | 2015-01-29 15:01:00 |
| Benji  | 2016-04-19 13:28:00 |
| Jackie | 2016-01-03 16:25:00 |
| \*Sam  | 2016-03-13 11:17:00 |

..이하 생략

***

본 문제는 [Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"](https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes)에서 제공하는 데이터를 사용하였으며 [ODbL](https://opendatacommons.org/licenses/odbl/1.0/)의 적용을 받습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
