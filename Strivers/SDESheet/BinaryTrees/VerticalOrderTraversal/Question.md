# Vertical Order Traversal of a Binary Tree

## Problem Statement

Given a binary tree, return its vertical order traversal as a list of lists, where each inner list contains the nodes at that vertical column (from leftmost to rightmost column, and top to bottom within each column).

## Example

Given the following binary tree:

```
      3
     / \
    9   20
        / \
       15  7
```

Output: [[9], [3, 15], [20], [7]]
Explanation: Nodes are grouped by their vertical columns.

## Approach

- Use BFS to traverse the tree and record each node's row and column.
- Use a min-heap to sort nodes by column, then row, then value.
- Group nodes by column for the final result.

## Edge Cases

- Tree is empty (return an empty list).
- Tree has only one node.

## Complexity

- Time: O(n log n) due to heap operations.
- Space: O(n)

## Implementation Notes

- Use a helper Tuple class to store node, row, and column.
- Use a priority queue for sorting.

## References

- [LeetCode 987 - Vertical Order Traversal of a Binary Tree](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/)
- Tags: Binary Tree, BFS, Sorting
