# Right View of Binary Tree

## Problem Statement

Given a binary tree, return its right view. The right view is the set of nodes visible when the tree is viewed from the right side.

**Constraints:**

1. The number of nodes in the tree is in the range [0, 100]
2. -100 ≤ Node.val ≤ 100
3. Return the values of visible nodes from top to bottom

## Examples

### Example 1

```
Input:
     1
   /   \
  2     3
   \     \
    5     4
Output: [1, 3, 4]
Explanation:
- Level 1: 1 is visible from right
- Level 2: 3 is visible from right
- Level 3: 4 is visible from right
```

### Example 2

```
Input:
    1
  /
 2
Output: [1, 2]
Explanation:
- Level 1: 1 is visible
- Level 2: 2 is visible (no right node)
```

### Example 3

```
Input:
     1
   /   \
  2     3
 /     /
4     5
Output: [1, 3, 5]
Explanation:
- Level 1: 1 is visible
- Level 2: 3 blocks 2
- Level 3: 5 is visible (rightmost)
```

## Approach & Intuition

1. **Level Order Traversal (BFS - Optimal)**

   ```java
   public List<Integer> rightView(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       if (root == null) return result;

       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);

       while (!queue.isEmpty()) {
           int levelSize = queue.size();

           for (int i = 0; i < levelSize; i++) {
               TreeNode node = queue.poll();

               // Add rightmost node of each level
               if (i == levelSize - 1) {
                   result.add(node.val);
               }

               // Add children to process next level
               if (node.left != null) queue.offer(node.left);
               if (node.right != null) queue.offer(node.right);
           }
       }
       return result;
   }
   ```

2. **Recursive DFS (Right to Left)**
   ```java
   class Solution {
       List<Integer> result = new ArrayList<>();

       public List<Integer> rightView(TreeNode root) {
           rightView(root, 0);
           return result;
       }

       private void rightView(TreeNode node, int level) {
           if (node == null) return;

           // First node at this level (from right)
           if (level == result.size()) {
               result.add(node.val);
           }

           // Process right before left
           rightView(node.right, level + 1);
           rightView(node.left, level + 1);
       }
   }
   ```

Key Intuition:

1. The rightmost node at each level is visible from the right
2. Process right subtree before left (gives priority to right nodes)
3. Keep track of levels to know when we first see a level

## Complexity Analysis

1. **Level Order (BFS) Approach**

   - Time: O(n)
     - Visit each node exactly once
     - Queue operations are O(1)
   - Space: O(w)
     - w is maximum width of tree
     - In worst case, w = n/2 for last level
   - Best for most cases due to intuitive implementation

2. **Recursive DFS Approach**
   - Time: O(n)
     - Visit each node once
   - Space: O(h)
     - h is height of tree
     - Recursion stack in worst case
   - Better space complexity for skewed trees

## Edge Cases

1. Empty tree (return empty list)
2. Single node tree
3. Left-skewed tree (no right nodes)
4. Right-skewed tree
5. Perfect binary tree
6. Complete binary tree
7. Tree with missing nodes on right
8. Maximum tree height
9. Tree with negative values
10. Tree with duplicate values

## Pattern Recognition

This problem relates to:

1. **Tree Views**

   - Left View (mirror of this problem)
   - Top View
   - Bottom View
   - Vertical Order View

2. **Level-wise Processing**

   - Level Order Traversal
   - Level Maximum/Minimum
   - Average of Levels

3. **DFS with Level Tracking**
   - Boundary Traversal
   - Vertical Order
   - Diagonal Traversal

## Implementation Tips

1. **Level Order Implementation**

   ```java
   // Process level by level
   while (!queue.isEmpty()) {
       int size = queue.size();  // Current level size

       // Process all nodes at current level
       for (int i = 0; i < size; i++) {
           TreeNode node = queue.poll();

           // Last node in level
           if (i == size - 1) {
               result.add(node.val);
           }
       }
   }
   ```

2. **DFS Implementation**

   ```java
   // Track levels for right view
   Map<Integer, Integer> rightmostNodes = new HashMap<>();

   void dfs(TreeNode node, int level) {
       if (node == null) return;

       // First node at this level from right
       rightmostNodes.putIfAbsent(level, node.val);

       // Process left before right
       dfs(node.left, level + 1);
       dfs(node.right, level + 1);
   }
   ```

## Common Templates

```java
// Template for tree view problems
public List<Integer> treeView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();

        for (int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();

            // Condition varies based on view type
            if (isVisible(i, levelSize)) {
                result.add(node.val);
            }

            // Add children (order matters for some views)
            addChildren(queue, node);
        }
    }
    return result;
}

// Helper for different view types
private boolean isVisible(int position, int levelSize) {
    // Right view: return position == levelSize - 1;
    // Left view: return position == 0;
    // Both views: return position == 0 || position == levelSize - 1;
}
```

## Related Problems

1. Binary Tree Left View
2. Binary Tree Top View
3. Binary Tree Bottom View
4. Vertical Order Traversal
5. Boundary Traversal of Binary Tree
6. Level Order Traversal
7. Diagonal Traversal
8. ZigZag Level Order Traversal

## Common Mistakes

1. Not handling null root
2. Processing left before right (for right view)
3. Not tracking levels correctly
4. Confusing level order vs depth-first approaches
5. Wrong queue processing in level order
6. Not maintaining level information
7. Incorrect recursion base case
8. Not clearing data structures between test cases
9. Assuming balanced tree structure
10. Not considering edge cases (skewed trees)
