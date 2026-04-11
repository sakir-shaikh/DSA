# Level Order Traversal of a Binary Tree

## Problem Statement

Given a binary tree, return its level order traversal as a list of lists, where each inner list contains the nodes at that level.

## Example

Given the following binary tree:

```
    1
   / \
  2   3
 / \
4   5
```

Output: [[1], [2, 3], [4, 5]]
Explanation: Each list contains the nodes at each level from top to bottom.

## Approach

- Use recursion to visit each node and add its value to the corresponding level list.
- Start from the root at level 0 and recursively visit left and right children, increasing the level.

## Edge Cases

- Tree is empty (return an empty list).
- Tree has only one node.

## Complexity

- Time: O(n), where n is the number of nodes.
- Space: O(n) for the result list and recursion stack.

## Implementation Notes

- Can also be implemented using a queue for iterative BFS.

## References

- Tags: Binary Tree, Level Order, BFS, Recursion
