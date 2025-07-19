# LeetCode 88 - Merge Sorted Array

🔗 [Problem Link](https://leetcode.com/problems/merge-sorted-array/)

---

## 🧠 Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n` representing the number of elements in `nums1` and `nums2`, respectively.  
Merge `nums2` into `nums1` as one sorted array in-place.

`nums1` has a length of `m + n`, where the last `n` elements are set to `0` and should be ignored.

---

## ✅ Approach

1. Use two pointers to traverse both arrays: `first` for `nums1` and `last` for `nums2`.
2. Create a temporary array `result` to store the merged elements.
3. Merge by comparing elements at both pointers and placing the smaller one into `result`.
4. Copy remaining elements from either array if one is exhausted.
5. Overwrite the first `m + n` elements of `nums1` with `result`.

**Complexity:** `O(m + n)` time for merging, `O(m + n)` space for temporary array.

---

## 📘 Example

**Input:**
