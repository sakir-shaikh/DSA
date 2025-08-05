# Sort a Stack Using Recursion

## Problem Statement

Sort a stack such that the smallest elements are on top. You can only use recursion and the standard stack operations (push, pop, peek, isEmpty).

## Example

Input: [3, 1, 4, 2]
Output: [1, 2, 3, 4] (from top to bottom)
Explanation: Recursively pop and insert elements in sorted order.

## Approach

- Use recursion to pop all elements.
- Sort the smaller stack.
- Insert each popped element back into the correct position using a helper `insert` method.

## Edge Cases

- Stack is empty.
- Stack has only one element.

## Complexity

- Time: O(n²)
- Space: O(n) due to recursion stack.

## Implementation Notes

- Only use stack operations and recursion.

## References

- Tags: Stack, Recursion, Sorting
