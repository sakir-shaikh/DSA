# ZigZag (Spiral) Level Order Traversal of Binary Tree

## Problem Statement

Given a binary tree, return its zigzag level order traversal as a list of lists. For each level, nodes are traversed from left to right, then right to left for the next level, and so on.

## Example

**Input:**  
Binary Tree:  
```
    1
   / \
  2   3
 / \   \
4   5   6
```

**Output:**  
```
[
  [1],
  [3, 2],
  [4, 5, 6]
]
```

## Approach

- Use a queue for level order traversal (BFS).
- Use a boolean flag to alternate between left-to-right and right-to-left.
- For each level, add node values to a linked list either at the end or the beginning based on the flag.

## Edge Cases

- Empty tree (root is null).
- Tree with only one node.
- Tree with only left or right children.

## Complexity

- **Time:** O(N), where N is the number of nodes.
- **Space:** O(N), for the result and queue.

## Pattern Recognition

- Look for problems asking for "zigzag", "spiral", or "alternating direction" level order traversal.
- Usually involves BFS with an alternating insertion order.

## References

- [LeetCode 103. Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)