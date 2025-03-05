# 79. Word Search

## Medium

***

Given an `m x n` grid of characters `board` and a string `word`, return `true` _if_ `word` _exists in the grid_.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

&#x20;

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/04/word2.jpg)

<pre><code><strong>Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
</strong><strong>Output: true
</strong></code></pre>

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/11/04/word-1.jpg)

<pre><code><strong>Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
</strong><strong>Output: true
</strong></code></pre>

**Example 3:**

![](https://assets.leetcode.com/uploads/2020/10/15/word3.jpg)

<pre><code><strong>Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
</strong><strong>Output: false
</strong></code></pre>

&#x20;

**Constraints:**

* `m == board.length`
* `n = board[i].length`
* `1 <= m, n <= 6`
* `1 <= word.length <= 15`
* `board` and `word` consists of only lowercase and uppercase English letters.

&#x20;

**Follow up:** Could you use search pruning to make your solution faster with a larger `board`?
