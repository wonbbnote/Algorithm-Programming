# 49. Group Anagrams

## Medium

***

Given an array of strings `strs`, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

&#x20;

**Example 1:**

<pre><code><strong>Input: strs = ["eat","tea","tan","ate","nat","bat"]
</strong><strong>Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
</strong></code></pre>

**Example 2:**

<pre><code><strong>Input: strs = [""]
</strong><strong>Output: [[""]]
</strong></code></pre>

**Example 3:**

<pre><code><strong>Input: strs = ["a"]
</strong><strong>Output: [["a"]]
</strong></code></pre>

&#x20;

**Constraints:**

* `1 <= strs.length <= 104`
* `0 <= strs[i].length <= 100`
* `strs[i]` consists of lowercase English letters.
