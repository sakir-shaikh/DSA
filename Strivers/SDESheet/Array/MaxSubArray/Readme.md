## Problem: Maximum Subarray (Kadane's Algorithm)

**Link**: [LeetCode #53](https://leetcode.com/problems/maximum-subarray/)

### Approach


# Maximum Subarray Sum

## Problem Statement
Find the contiguous subarray within a one-dimensional array of numbers which has the largest sum.

## Clarification
- The array may contain negative numbers.
- The subarray must be contiguous.

## Example
Input: `[-2,1,-3,4,-1,2,1,-5,4]`
Output: `6` (Subarray `[4,-1,2,1]`)

## Approach
- Use Kadane's Algorithm to find the maximum sum efficiently.

## Edge Cases
- If all numbers are negative, return the largest (least negative) number.
- If the array is empty, return 0.

## Implementation Notes
- The solution maintains a running sum and updates the maximum found so far.

---

See `MaxSubArray.java` for implementation details.
