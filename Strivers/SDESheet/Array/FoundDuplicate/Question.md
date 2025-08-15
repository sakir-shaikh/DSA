# Find the Duplicate Number

## Problem Statement

Given an array of integers `nums` containing `n + 1` integers where each integer is between `1` and `n` (inclusive), there is at least one duplicate number. Find the duplicate number.  
You must not modify the array and must use only constant extra space.

## Input / Output

- Input: integer array `nums` of length `n + 1`
- Output: a single integer that is a duplicate in `nums`

## Example

- Input: `[1, 3, 4, 2, 2]`  
  Output: `2`
- Input: `[3,1,3,4,2]`  
  Output: `3`

## Approach (Recommended)

Use Floyd's Tortoise and Hare (cycle detection) by modeling the array as a linked list:

1. Treat index → value as a pointer (i -> nums[i]).
2. Use two pointers (slow, fast) to find an intersection inside the cycle.
3. Initialize a second pointer at the start and move both pointers one step at a time; their meeting point is the duplicate.

Steps:

- slow = nums[0], fast = nums[0]
- Move slow = nums[slow], fast = nums[nums[fast]] until slow == fast
- Set slow2 = nums[0]
- Move slow and slow2 one step until they meet; return meeting value

## Why it works

Because values are in range [1..n], the mapping from indices to values creates a directed graph with at least one cycle. The start of the cycle corresponds to the duplicate.

## Complexity

- Time: O(n)
- Space: O(1)

## Edge Cases

- Duplicate value appears more than twice.
- Small arrays (minimum length 2).
- All values valid in range [1..n].

## Pattern Recognition

Use this approach when:

- Problem asks for a duplicate in `1..n` range.
- You cannot modify the input and must use constant extra space.
- Typical LeetCode prompt wording: "find the duplicate", "no modification", "constant extra space".

## Implementation Notes

- Do not sort or use extra data structures (those violate constraints).
- Ensure indices used are within bounds; array values guarantee valid indices.

## Test Cases

- `[1,1]` -> `1`
- `[1,2,3,4,2]` -> `2`
- `[2,2,2,2,2]` -> `2`
- `[3,1,3,4,2]` -> `3`

## References

- LeetCode 287 — Find the Duplicate Number
- Floyd's Tortoise and
