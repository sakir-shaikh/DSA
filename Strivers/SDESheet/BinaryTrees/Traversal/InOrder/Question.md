# InOrder Traversal of a Binary Tree

## Problem Statement

Given a binary tree, perform an inorder traversal and print the nodes in the order they are visited.

## Example

Given the following binary tree:

```
    1
   / \
  2   3
 / \
4   5
```

Output: `4 2 5 1 3`
Explanation: Visit left subtree, root, then right subtree.

## Approach

- Recursively traverse the left subtree
- Print the root node's data
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

### Implementation Notes

- The solution uses a recursive function `inOrderTraversal(Node root)`.
- The `Node` class represents each node in the tree with `data`, `left`, and `right` fields.

### Usage

Call `inOrderTraversal(root)` where `root` is the root node of your binary tree.

---

For more details, see the code in `Solution.java`.
