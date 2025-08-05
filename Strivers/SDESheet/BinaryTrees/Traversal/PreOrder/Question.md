# PreOrder Traversal of a Binary Tree

## Problem Statement

Given a binary tree, perform a preorder traversal and print the nodes in the order they are visited.

## Example

Given the following binary tree:

```
    1
   / \
  2   3
 / \
4   5
```

Output: `1 2 4 5 3`
Explanation: Visit root, left subtree, then right subtree.

## Approach

- Print the root node's data
- Recursively traverse the left subtree
- Recursively traverse the right subtree

## Edge Cases

- If the tree is empty, nothing is printed.
- Works for both balanced and unbalanced trees.

## Complexity

- Time: O(n)
- Space: O(h) for recursion stack, where h is tree height.

## Implementation Notes

- Can be implemented recursively or iteratively using a stack.

## References

- Tags: Binary Tree, Traversal, Recursion
