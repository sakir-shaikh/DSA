# LeetCode 75 - Sort Colors

🔗 [Problem Link](https://leetcode.com/problems/sort-colors/)

---

## 🧠 Problem Statement

Given an array `nums` with `n` objects colored red, white, or blue (represented by `0`, `1`, and `2` respectively), sort them in-place so that objects of the same color are adjacent, in the order red (0), white (1), and blue (2).

You must solve this problem **without using any library sort function**.

---

## 📌 Constraints

- `1 <= nums.length <= 300`
- `nums[i]` is either `0`, `1`, or `2`.

---

## ✅ Approach: Dutch National Flag Algorithm

- Initialize three pointers:
  - `low` for tracking 0s
  - `mid` for current element
  - `high` for tracking 2s
- Traverse and swap values accordingly to group 0s, 1s, and 2s in a single pass.

---

## ⏱️ Time Complexity

O(n)

## Space Complexity
O(1)