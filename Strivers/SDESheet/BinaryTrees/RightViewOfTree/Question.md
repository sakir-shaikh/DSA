# Right View of Binary Tree

## Problem

Given a binary tree, return the **right view** of it. The right view contains the rightmost node at each level when viewed from the right side.

## Approach

Use a preorder traversal (node → left → right), keeping track of the depth. At each depth, store the latest node in a map. The last node seen at each level (from left to right traversal) will be the rightmost node.

## Code



## Time & Space Complexity

* **Time Complexity:** O(n), where n = number of nodes
* **Space Complexity:** O(h + d), where h = tree height (recursion stack), d = number of levels (map size)
