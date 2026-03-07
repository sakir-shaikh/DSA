# Merge Sorted Array

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n` representing the number of elements in `nums1` and `nums2`, respectively. Merge `nums2` into `nums1` as one sorted array in-place. `nums1` has a length of `m + n`, where the last `n` elements are set to `0` and should be ignored.

## Example

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: Merge nums2 into nums1 and sort in-place.

## Approach

- Use two pointers to traverse both arrays from the end.
- Place the largest element at the end of nums1.
- Continue until all elements are merged.

## Edge Cases

- nums2 is empty.
- nums1 is empty except for zeros.

## Complexity

- Time: O(m + n)
- Space: O(1) (in-place)

## Implementation Notes

- Start merging from the end to avoid overwriting elements in nums1.

## References

- [LeetCode 88 - Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
- Tags: Array, Two Pointers, Sorting
