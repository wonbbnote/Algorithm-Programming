# 77. Combinations

## Medium

***

Given two integers `n` and `k`, return _all possible combinations of_ `k` _numbers chosen from the range_ `[1, n]`.

You may return the answer in **any order**.

&#x20;

**Example 1:**

<pre><code><strong>Input: n = 4, k = 2
</strong><strong>Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
</strong><strong>Explanation: There are 4 choose 2 = 6 total combinations.
</strong>Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
</code></pre>

**Example 2:**

<pre><code><strong>Input: n = 1, k = 1
</strong><strong>Output: [[1]]
</strong><strong>Explanation: There is 1 choose 1 = 1 total combination.
</strong></code></pre>

&#x20;

**Constraints:**

* `1 <= n <= 20`
* `1 <= k <= n`
