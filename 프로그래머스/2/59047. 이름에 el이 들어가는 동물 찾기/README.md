# \[level 2] 이름에 el이 들어가는 동물 찾기 - 59047

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59047)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > String， Date

### 채점결과

Empty

### 제출 일자

2024년 12월 07일 01:10:09

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

보호소에 돌아가신 할머니가 기르던 개를 찾는 사람이 찾아왔습니다. 이 사람이 말하길 할머니가 기르던 개는 이름에 'el'이 들어간다고 합니다. 동물 보호소에 들어온 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 이때 결과는 이름 순으로 조회해주세요. 단, 이름의 대소문자는 구분하지 않습니다.

**예시**

예를 들어 `ANIMAL_INS` 테이블이 다음과 같다면

| ANIMAL\_ID | ANIMAL\_TYPE | DATETIME            | INTAKE\_CONDITION | NAME         | SEX\_UPON\_INTAKE |
| ---------- | ------------ | ------------------- | ----------------- | ------------ | ----------------- |
| A355753    | Dog          | 2015-09-10 13:14:00 | Normal            | Elijah       | Neutered Male     |
| A352872    | Dog          | 2015-07-09 17:51:00 | Aged              | Peanutbutter | Neutered Male     |
| A353259    | Dog          | 2016-05-08 12:57:00 | Injured           | Bj           | Neutered Male     |
| A373219    | Cat          | 2014-07-29 11:43:00 | Normal            | Ella         | Spayed Female     |
| A382192    | Dog          | 2015-03-13 13:14:00 | Normal            | Maxwell 2    | Intact Male       |

* 이름에 'el'이 들어가는 동물은 Elijah, Ella, Maxwell 2입니다.
* 이 중, 개는 Elijah, Maxwell 2입니다.

따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.

| ANIMAL\_ID | NAME      |
| ---------- | --------- |
| A355753    | Elijah    |
| A382192    | Maxwell 2 |

***

본 문제는 [Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"](https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes)에서 제공하는 데이터를 사용하였으며 [ODbL](https://opendatacommons.org/licenses/odbl/1.0/)의 적용을 받습니다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
