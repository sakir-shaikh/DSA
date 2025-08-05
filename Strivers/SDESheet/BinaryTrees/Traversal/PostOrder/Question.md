# PostOrder Traversal of a Binary Tree

## Problem Statement

Given a binary tree, perform a postorder traversal and print the nodes in the order they are visited.

## Example

Given the following binary tree:

```
    1
   / \
  2   3
 / \
4   5
```

Output: `4 5 2 3 1`
Explanation: Visit left subtree, right subtree, then root.

## Approach

- Recursively traverse the left subtree
- Recursively traverse the right subtree
- Print the root node's data

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
