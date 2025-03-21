# \[level 3] 조회수가 가장 많은 중고거래 게시판의 첨부파일 조회하기 - 164671

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/164671)

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > String， Date

### 채점결과

Empty

### 제출 일자

2024년 11월 29일 21:30:56

### 문제 설명

다음은 중고거래 게시판 정보를 담은 `USED_GOODS_BOARD` 테이블과 중고거래 게시판 첨부파일 정보를 담은 `USED_GOODS_FILE` 테이블입니다. `USED_GOODS_BOARD` 테이블은 다음과 같으며 `BOARD_ID`, `WRITER_ID`, `TITLE`, `CONTENTS`, `PRICE`, `CREATED_DATE`, `STATUS`, `VIEWS`은 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.

| Column name   | Type          | Nullable |
| ------------- | ------------- | -------- |
| BOARD\_ID     | VARCHAR(5)    | FALSE    |
| WRITER\_ID    | VARCHAR(50)   | FALSE    |
| TITLE         | VARCHAR(100)  | FALSE    |
| CONTENTS      | VARCHAR(1000) | FALSE    |
| PRICE         | NUMBER        | FALSE    |
| CREATED\_DATE | DATE          | FALSE    |
| STATUS        | VARCHAR(10)   | FALSE    |
| VIEWS         | NUMBER        | FALSE    |

`USED_GOODS_FILE` 테이블은 다음과 같으며 `FILE_ID`, `FILE_EXT`, `FILE_NAME`, `BOARD_ID`는 각각 파일 ID, 파일 확장자, 파일 이름, 게시글 ID를 의미합니다.

| Column name | Type         | Nullable |
| ----------- | ------------ | -------- |
| FILE\_ID    | VARCHAR(10)  | FALSE    |
| FILE\_EXT   | VARCHAR(5)   | FALSE    |
| FILE\_NAME  | VARCHAR(256) | FALSE    |
| BOARD\_ID   | VARCHAR(10)  | FALSE    |

***

**문제**

`USED_GOODS_BOARD`와 `USED_GOODS_FILE` 테이블에서 조회수가 가장 높은 중고거래 게시물에 대한 첨부파일 경로를 조회하는 SQL문을 작성해주세요. 첨부파일 경로는 FILE ID를 기준으로 내림차순 정렬해주세요. 기본적인 파일경로는 /home/grep/src/ 이며, 게시글 ID를 기준으로 디렉토리가 구분되고, 파일이름은 파일 ID, 파일 이름, 파일 확장자로 구성되도록 출력해주세요. 조회수가 가장 높은 게시물은 하나만 존재합니다.

***

**예시**

`USED_GOODS_BOARD` 테이블이 다음과 같고

| BOARD\_ID | WRITER\_ID | TITLE        | CONTENTS                     | PRICE  | CREATED\_DATE | STATUS | VIEWS |
| --------- | ---------- | ------------ | ---------------------------- | ------ | ------------- | ------ | ----- |
| B0001     | kwag98     | 반려견 배변패드 팝니다 | 정말 저렴히 판매합니다. 전부 미개봉 새상품입니다. | 12000  | 2022-10-01    | DONE   | 250   |
| B0002     | lee871201  | 국내산 볶음참깨     | 직접 농사지은 참깨입니다.               | 3000   | 2022-10-02    | DONE   | 121   |
| B0003     | goung12    | 배드민턴 라켓      | 사놓고 방치만 해서 팝니다.              | 9000   | 2022-10-02    | SALE   | 212   |
| B0004     | keel1990   | 디올 귀걸이       | 신세계강남점에서 구입. 정품 아닐시 백퍼센트 환불  | 130000 | 2022-10-02    | SALE   | 199   |
| B0005     | haphli01   | 스팸클래식 팔아요    | 유통기한 2025년까지에요               | 10000  | 2022-10-02    | SALE   | 121   |

`USED_GOODS_FILE` 테이블이 다음과 같을 때

| FILE\_ID    | FILE\_EXT | FILE\_NAME | BOARD\_ID |
| ----------- | --------- | ---------- | --------- |
| IMG\_000001 | .jpg      | photo1     | B0001     |
| IMG\_000002 | .jpg      | photo2     | B0001     |
| IMG\_000003 | .png      | 사진         | B0002     |
| IMG\_000004 | .jpg      | 사진         | B0003     |
| IMG\_000005 | .jpg      | photo      | B0004     |

SQL을 실행하면 다음과 같이 출력되어야 합니다.

| FILE\_PATH                                 |
| ------------------------------------------ |
| /home/grep/src/B0001/IMG\_000001photo1.jpg |
| /home/grep/src/B0001/IMG\_000002photo2.jpg |

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
