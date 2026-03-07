# Nth Root of an Integer

## Problem Statement

Given two integers `n` and `m`, find the integer `x` such that `x^n = m`. If no such integer exists, return -1.

## Example

Input: n = 3, m = 27
Output: 3
Explanation: 3^3 = 27, so the answer is 3.

## Approach

- Use binary search between 1 and m.
- At each step, compute `mid^n` and compare it to m.
- Adjust the search range accordingly.
- If an exact match is found, return mid.

## Edge Cases

- m = 0 or 1.
- n = 1.
- No integer root exists.

## Complexity

- Time: O(log m)
- Space: O(1)

## Implementation Notes

- Use integer exponentiation to avoid overflow.

## References

- Tags: Binary Search, Math, Exponentiation
