# \[level 2] n^2 배열 자르기 - 87390

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/87390)

### 성능 요약

메모리: 108 MB, 시간: 7.49 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌3

### 채점결과

정확성: 100.0\
합계: 100.0 / 100.0

### 제출 일자

2024년 10월 05일 21:05:31

### 문제 설명

정수 `n`, `left`, `right`가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.

1. `n`행 `n`열 크기의 비어있는 2차원 배열을 만듭니다.
2. `i = 1, 2, 3, ..., n`에 대해서, 다음 과정을 반복합니다.
   * 1행 1열부터 `i`행 `i`열까지의 영역 내의 모든 빈 칸을 숫자 `i`로 채웁니다.
3. 1행, 2행, ..., `n`행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
4. 새로운 1차원 배열을 `arr`이라 할 때, `arr[left]`, `arr[left+1]`, ..., `arr[right]`만 남기고 나머지는 지웁니다.

정수 `n`, `left`, `right`가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.

***

**제한사항**

* 1 ≤ `n` ≤ 107
* 0 ≤ `left` ≤ `right` < n2
* `right` - `left` < 105

***

**입출력 예**

| n | left | right | result              |
| - | ---- | ----- | ------------------- |
| 3 | 2    | 5     | `[3,2,2,3]`         |
| 4 | 7    | 14    | `[4,3,3,3,4,4,4,4]` |

***

**입출력 예 설명**

**입출력 예 #1**

* 다음 애니메이션은 주어진 과정대로 1차원 배열을 만드는 과정을 나타낸 것입니다.

![ex1](https://grepp-programmers.s3.amazonaws.com/production/file_resource/103/FlattenedFills_ex1.gif)

**입출력 예 #2**

* 다음 애니메이션은 주어진 과정대로 1차원 배열을 만드는 과정을 나타낸 것입니다.

![ex2](https://grepp-programmers.s3.amazonaws.com/production/file_resource/104/FlattenedFills_ex2.gif)

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
