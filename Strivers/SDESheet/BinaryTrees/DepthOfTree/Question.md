# Maximum Depth of Binary Tree

## Problem Statement

Given the root of a binary tree, find its maximum depth (height). The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Examples

### Example 1

```
Input:
    1
   / \
  2   3
 / \
4   5

Output: 3
Explanation: Longest path is either 1→2→4 or 1→2→5 (depth = 3)
```

### Example 2

```
Input:
    1
     \
      2
Output: 2
```

## Approach & Intuition

The maximum depth of a binary tree can be found recursively by:

1. Finding depth of left subtree
2. Finding depth of right subtree
3. Taking maximum of both depths and adding 1 (for current node)

### Recursive Approach

```java
maxDepth(node) = 1 + max(maxDepth(node.left), maxDepth(node.right))
```

### Iterative Approach (Level Order)

1. Use queue for level order traversal
2. Count number of levels
3. Return final level count

## Complexity Analysis

- Time Complexity: O(n), visit each node once
- Space Complexity:
  - Recursive: O(h) for recursion stack
  - Iterative: O(w) for queue, w = max width

## Edge Cases

1. Empty tree (return 0)
2. Single node (return 1)
3. Skewed tree (all nodes to one side)
4. Complete binary tree
5. Perfect binary tree

## Pattern Recognition

Use this approach when:

- Finding height/depth of tree
- Level-based tree properties
- Balanced tree verification
- Height-balanced tree problems

## Implementation Tips

1. Use recursion for cleaner code
2. Handle null checks first
3. Consider both recursive and iterative
4. Use Math.max() for comparing depths

## Related Problems

1. Balanced Binary Tree
2. Minimum Depth of Binary Tree
3. Maximum Width of Binary Tree
4. Diameter of Binary Tree

## Common Mistakes

1. Not handling null root
2. Confusing depth with number of edges
3. Not considering unbalanced trees
4. Inefficient repeated calculations
