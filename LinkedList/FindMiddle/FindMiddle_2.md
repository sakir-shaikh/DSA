# Middle of the Linked List

## Problem Statement

Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

## Example

Input: head = [1,2,3,4,5]
Output: Node with value 3
Explanation: The middle node is the third node in the list.

## Approach

- Use two pointers, slow and fast. Move slow by one step and fast by two steps. When fast reaches the end, slow will be at the middle.

## Edge Cases

- List has only one node.
- List has an even number of nodes.

## Complexity

- Time: O(n)
- Space: O(1)

## Implementation Notes

- Handles both odd and even length lists.

## References

- [LeetCode 876 - Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)
- Tags: Linked List, Two Pointers
