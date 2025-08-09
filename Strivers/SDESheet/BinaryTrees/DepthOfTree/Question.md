# Depth (Height) of a Binary Tree

## Problem Statement

Given the root of a binary tree, find its maximum depth (height). The depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Example

Given the following binary tree:

```
    1
   / \
  2   3
 / \
4   5
```

Output: 3
Explanation: The longest path is 1 → 2 → 4 (or 1 → 2 → 5 or 1 → 3), so the depth is 3.

## Approach

- Use recursion to compute the depth of left and right subtrees.
- The depth of the tree is 1 + max(left depth, right depth).

## Edge Cases

- Tree is empty (depth is 0).
- Tree has only one node (depth is 1).

## Complexity

- Time: O(n), where n is the number of nodes.
- Space: O(h), where h is the height of the tree (recursion stack).

## Implementation Notes

- Can also be solved iteratively using BFS.

## References

- Tags: Binary Tree, Recursion, Depth, Height
