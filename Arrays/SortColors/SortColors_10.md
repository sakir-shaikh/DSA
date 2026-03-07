# Sort Colors

## Problem Statement

Given an array `nums` with `n` objects colored red, white, or blue (represented by `0`, `1`, and `2` respectively), sort them in-place so that objects of the same color are adjacent, in the order red (0), white (1), and blue (2). You must solve this problem without using any library sort function.

## Example

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Explanation: Sort the array so that all 0s come first, then 1s, then 2s.

## Approach

- Use the Dutch National Flag Algorithm.
- Initialize three pointers: low for 0s, mid for current element, high for 2s.
- Traverse and swap values accordingly to group 0s, 1s, and 2s in a single pass.

## Edge Cases

- Array contains only one color.
- Array is already sorted.

## Complexity

- Time: O(n)
- Space: O(1)

## Implementation Notes

- In-place sorting using three pointers.

## References

- [LeetCode 75 - Sort Colors](https://leetcode.com/problems/sort-colors/)
- Tags: Array, Sorting, Two Pointers
