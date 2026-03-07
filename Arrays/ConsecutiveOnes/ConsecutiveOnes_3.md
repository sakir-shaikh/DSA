# Maximum Consecutive Ones

## Problem Statement

Given a binary array, find the maximum number of consecutive 1s in the array.

## Example

Input: [1,1,0,1,1,1]
Output: 3
Explanation: The longest sequence of consecutive 1s is of length 3.

## Approach

- Traverse the array, count consecutive 1s, and update the maximum count.

## Edge Cases

- Array contains only 0s.
- Array contains only 1s.
- Array is empty.

## Complexity

- Time: O(n)
- Space: O(1)

## Implementation Notes

- Use a single pass and two counters.

## References

- [LeetCode 485 - Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/)
- Tags: Array, Linked List, Sliding Window
