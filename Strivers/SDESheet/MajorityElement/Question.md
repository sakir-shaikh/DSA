# LeetCode 169 - Majority Element

🔗 [Problem Link](https://leetcode.com/problems/majority-element/)

---

## 🧠 Problem Statement

Given an array `nums` of size `n`, return the majority element.  
The majority element is the element that appears more than `⌊n / 2⌋` times.  
You may assume that the majority element always exists in the array.

---

## ✅ Approach

Used **Moore’s Voting Algorithm**:

1. Initialize `element` as a candidate for majority and `count` as 0.
2. Traverse the array:
   - If `count` is 0, set `element` to current number.
   - If current number equals `element`, increment `count`.
   - Else, decrement `count`.
3. Return `element` as the majority.

**Complexity:** `O(n)` time for single pass, `O(1)` space.
