# 53. Maximum Subarray

## Medium

***

Given an integer array `nums`, find the subarray with the largest sum, and return _its sum_.

&#x20;

**Example 1:**

<pre><code><strong>Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
</strong><strong>Output: 6
</strong><strong>Explanation: The subarray [4,-1,2,1] has the largest sum 6.
</strong></code></pre>

**Example 2:**

<pre><code><strong>Input: nums = [1]
</strong><strong>Output: 1
</strong><strong>Explanation: The subarray [1] has the largest sum 1.
</strong></code></pre>

**Example 3:**

<pre><code><strong>Input: nums = [5,4,-1,7,8]
</strong><strong>Output: 23
</strong><strong>Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
</strong></code></pre>

&#x20;

**Constraints:**

* `1 <= nums.length <= 105`
* `-104 <= nums[i] <= 104`

&#x20;

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution using the **divide and conquer** approach, which is more subtle.
