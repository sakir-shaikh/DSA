# InOrder Traversal of a Binary Tree

## Problem Statement
Given a binary tree, perform an inorder traversal and print the nodes in the order they are visited.

### What is InOrder Traversal?
InOrder traversal is a depth-first traversal method for binary trees. The order of visiting nodes is:
1. Traverse the left subtree
2. Visit the root node
3. Traverse the right subtree

### Example
Given the following binary tree:
```
    1
   / \
  2   3
 / \
4   5
```
The inorder traversal will print: `4 2 5 1 3`

### Approach
- Recursively traverse the left subtree
- Print the root node's data
- Recursively traverse the right subtree

### Edge Cases
- If the tree is empty, nothing is printed.
- Works for both balanced and unbalanced trees.

### Implementation Notes
- The solution uses a recursive function `inOrderTraversal(Node root)`.
- The `Node` class represents each node in the tree with `data`, `left`, and `right` fields.

### Usage
Call `inOrderTraversal(root)` where `root` is the root node of your binary tree.

---

For more details, see the code in `Solution.java`.
