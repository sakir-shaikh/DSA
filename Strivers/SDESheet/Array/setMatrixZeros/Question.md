# Set Matrix Zeroes

## Problem Statement

Given an `m x n` integer matrix, if an element is `0`, set its entire row and column to `0`. You must do it in place.

## Example

Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: The element at (1,1) is 0, so set row 1 and column 1 to 0.

## Approach

- Use the first row and first column as markers to keep track of zeroes.
- Use two additional flags to separately handle the first row and column.
- Traverse the matrix and mark the row and column headers if a zero is found.
- In a second pass, set matrix cells to zero if their row or column is marked.
- Finally, zero out the first row and/or column if the respective flags are set.

## Edge Cases

- Matrix has no zeroes.
- Matrix is 1x1.

## Complexity

- Time: O(m \* n)
- Space: O(1)

## Implementation Notes

- In-place solution using constant space.

## References

- [LeetCode 73 - Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
- Tags: Array, Matrix, In-place
