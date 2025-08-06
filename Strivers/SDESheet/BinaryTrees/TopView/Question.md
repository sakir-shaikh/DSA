
# Top View of a Binary Tree

## Problem Statement
Given a binary tree, return the top view of the tree as a list of node values from leftmost to rightmost.

## Example
Given the following binary tree:
```
      1
     / \
    2   3
     \   \
      4   5
```
Output: [2, 1, 3, 5]
Explanation: Nodes visible from the top are 2, 1, 3, and 5.

## Approach
- Use a queue for BFS traversal and a map to store the first node at each horizontal distance (hd).
- Traverse the tree, updating the map only if the horizontal distance is not already present.
- After traversal, collect the node values from the map in order of horizontal distance.

## Edge Cases
- Tree is empty (return an empty list).
- Tree has only one node.

## Complexity
- Time: O(n), where n is the number of nodes.
- Space: O(n) for the queue and map.

## Implementation Notes
- Use a helper Pair class to store nodes and their horizontal distances.

## References
- Tags: Binary Tree, Top View, BFS, Map
