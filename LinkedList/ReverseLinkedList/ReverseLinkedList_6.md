# Reverse Linked List

## Problem Statement

Given the `head` of a singly linked list, reverse the list and return the reversed list.

## Example

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The list is reversed so the last node becomes the first.

## Approach

- Traverse the list and push all node values onto a stack.
- Traverse the list again and replace each node’s value with the top of the stack.
- This reverses the list by value (not pointers).

## Edge Cases

- List is empty.
- List has only one node.

## Complexity

- Time: O(n) for two traversals.
- Space: O(n) for the stack.

## Implementation Notes

- Can also reverse by changing pointers.

## References

- [LeetCode 206 - Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- Tags: Linked List, Iteration, Stack

## 🔁 Tags

`Linked List` `Stack` `Two Pass` `Reverse`
