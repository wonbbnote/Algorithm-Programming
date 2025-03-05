# \[level 2] 물고기 종류 별 잡은 수 구하기 - 293257

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/293257)

### 성능 요약

메모리: undefined, 시간:

### 구분

코딩테스트 연습 > GROUP BY

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2024년 12월 18일 16:24:07

### 문제 설명

낚시앱에서 사용하는 `FISH_INFO` 테이블은 잡은 물고기들의 정보를 담고 있습니다. `FISH_INFO` 테이블의 구조는 다음과 같으며 `ID`, `FISH_TYPE`, `LENGTH`, `TIME`은 각각 잡은 물고기의 ID, 물고기의 종류(숫자), 잡은 물고기의 길이(cm), 물고기를 잡은 날짜를 나타냅니다.

| Column name | Type    | Nullable |
| ----------- | ------- | -------- |
| ID          | INTEGER | FALSE    |
| FISH\_TYPE  | INTEGER | FALSE    |
| LENGTH      | FLOAT   | TRUE     |
| TIME        | DATE    | FALSE    |

단, 잡은 물고기의 길이가 10cm 이하일 경우에는 `LENGTH` 가 NULL 이며, `LENGTH` 에 NULL 만 있는 경우는 없습니다.

`FISH_NAME_INFO` 테이블은 물고기의 이름에 대한 정보를 담고 있습니다. `FISH_NAME_INFO` 테이블의 구조는 다음과 같으며, `FISH_TYPE`, `FISH_NAME` 은 각각 물고기의 종류(숫자), 물고기의 이름(문자) 입니다.

| Column name | Type    | Nullable |
| ----------- | ------- | -------- |
| FISH\_TYPE  | INTEGER | FALSE    |

\| FISH\_NAME | VARCHAR | FALSE |

***

**문제**

`FISH_NAME_INFO`에서 물고기의 종류 별 물고기의 이름과 잡은 수를 출력하는 SQL문을 작성해주세요.

물고기의 이름 컬럼명은 `FISH_NAME`, 잡은 수 컬럼명은 `FISH_COUNT`로 해주세요.\
결과는 잡은 수 기준으로 내림차순 정렬해주세요.

***

`FISH_INFO` 테이블이 다음과 같고

| ID | FISH\_TYPE | LENGTH | TIME       |
| -- | ---------- | ------ | ---------- |
| 0  | 0          | 13.37  | 2021/12/04 |
| 1  | 0          | 50     | 2020/03/07 |
| 2  | 0          | 40     | 2020/03/07 |
| 3  | 1          | 43.33  | 2022/03/09 |
| 4  | 1          | NULL   | 2022/04/08 |
| 5  | 2          | 32     | 2020/04/28 |

`FISH_NAME_INFO` 테이블이 다음과 같다면

| FISH\_TYPE | FISH\_NAME |
| ---------- | ---------- |
| 0          | BASS       |
| 1          | SNAPPER    |
| 2          | ANCHOVY    |

종류가 0인 물고기는 3마리, 1인 물고기는 2마리, 2인 물고기는 1마리를 잡았으며, 각각 이름이 'BASS', 'SNAPPER', 'ANCHOVY' 입니다. 따라서 잡은 수를 기준으로 내림차순 정렬하면 결과는 다음과 같습니다.

| FISH\_COUNT | FISH\_NAME |
| ----------- | ---------- |
| 3           | BASS       |
| 2           | SNAPPER    |
| 1           | ANCHOVY    |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
