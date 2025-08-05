# Majority Element

## Problem Statement

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊n/2⌋ times.

## Clarification

- There is always a majority element in the array.
- The solution should be efficient (O(n) time, O(1) space).

## Example

Input: `[3, 3, 4, 2, 4, 4, 2, 4, 4]`
Output: `4`

## Approach

- Use the Boyer-Moore Voting Algorithm to find the majority element efficiently.

## Edge Cases

- If the array is empty, there is no majority element.
- If all elements are the same, that element is the majority.

## Implementation Notes

- The solution iterates through the array to find a candidate and then verifies it.

---

See `Solution.java` for implementation details.
