# LeetCode 26 - Remove Duplicates from Sorted Array

🔗 [Problem Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

---

## 🧠 Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should be kept the same. Return the number of unique elements.

You must do this with `O(1)` extra memory.

---

## ✅ Approach

1. Use two pointers: `i` for tracking the position of the last unique element, `j` for scanning through the array.
2. Whenever a new unique element is found at `j`, increment `i` and set `nums[i] = nums[j]`.
3. Return `i + 1` as the count of unique elements.

**Complexity:** `O(n)` time for one traversal, `O(1)` space in-place.

---

## 📘 Example

**Input:**
nums = [0,0,1,1,1,2,2,3,3,4]


**Output:**
5, nums = [0,1,2,3,4,...]


---

## 🔁 Tags

`Array` `Two Pointers` `In-place` `Sorting`