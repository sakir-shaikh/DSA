# Happy Number

## Problem Statement

Write an algorithm to determine if a number `n` is "happy".

A happy number is a number which replaces the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return `true` if `n` is a happy number, and `false` if not.

## Example

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Input: n = 2
Output: false

## Approach

- Use Floyd's Cycle-Finding Algorithm (Slow and Fast Pointers).
- `slow` moves one step at a time (sum of squares once).
- `fast` moves two steps at a time (sum of squares twice).
- If `fast` reach 1, it's a happy number.
- If `slow == fast` and not 1, it's a cycle and not a happy number.

## Edge Cases

- n = 1 (Happy number).
- n = small numbers which are not happy.

## Complexity

- Time: O(log n)
- Space: O(1)

## Implementation Notes

- The function `ss` computes the sum of the squares of the digits of a number.

## References

- Tags: Math, Hashing, Two Pointers, Cycle Detection
