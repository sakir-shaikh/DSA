# Top View of Binary Tree

## Problem Statement

Given a binary tree, return its top view. The top view of a binary tree is the set of nodes visible when looking at the tree from above (top). A node is visible from the top if it's the first node encountered at its horizontal distance from the root.

**Constraints:**

1. The number of nodes in the tree is in the range [0, 10⁴]
2. -10⁴ ≤ Node.val ≤ 10⁴
3. Return the values from left to right order
4. Each node value will be unique

## Examples

### Example 1

```
Input:
       1
     /   \
    2     3
     \     \
      4     5
Output: [2, 1, 3, 5]
Explanation:
- From top view:
  - 2 is the leftmost visible (hd = -1)
  - 1 is visible at root position (hd = 0)
  - 3 and 5 are visible on right (hd = 1, 2)
- 4 is hidden behind 2
```

### Example 2

```
Input:
       1
     /   \
    2     3
   / \   / \
  4   5 6   7
Output: [4, 2, 1, 3, 7]
Explanation:
- 4 visible at leftmost (hd = -2)
- 2 visible at hd = -1
- 1 visible at root (hd = 0)
- 3 visible at hd = 1
- 7 visible at rightmost (hd = 2)
- 5, 6 are hidden
```

### Example 3

```
Input: []
Output: []
Explanation: Empty tree has no nodes to view
```

## Approach & Intuition

1. **Level Order with HashMap (BFS - Optimal)**

   ```java
   class Solution {
       class Pair {
           TreeNode node;
           int hd;  // horizontal distance
           Pair(TreeNode node, int hd) {
               this.node = node;
               this.hd = hd;
           }
       }

       public List<Integer> topView(TreeNode root) {
           List<Integer> result = new ArrayList<>();
           if (root == null) return result;

           // Map to store first node at each horizontal distance
           TreeMap<Integer, Integer> map = new TreeMap<>();
           Queue<Pair> queue = new LinkedList<>();
           queue.offer(new Pair(root, 0));

           while (!queue.isEmpty()) {
               Pair cur = queue.poll();
               TreeNode node = cur.node;
               int hd = cur.hd;

               // Only add if this is first node at this horizontal distance
               if (!map.containsKey(hd)) {
                   map.put(hd, node.val);
               }

               if (node.left != null) {
                   queue.offer(new Pair(node.left, hd - 1));
               }
               if (node.right != null) {
                   queue.offer(new Pair(node.right, hd + 1));
               }
           }

           // Add values from left to right
           result.addAll(map.values());
           return result;
       }
   }
   ```

2. **Recursive DFS with Distance Tracking**

   ```java
   class Solution {
       TreeMap<Integer, Pair<Integer, Integer>> map = new TreeMap<>();

       public List<Integer> topView(TreeNode root) {
           List<Integer> result = new ArrayList<>();
           if (root == null) return result;

           // DFS with level tracking
           topView(root, 0, 0);

           // Collect results from left to right
           for (Map.Entry<Integer, Pair<Integer, Integer>> entry : map.entrySet()) {
               result.add(entry.getValue().getKey());
           }
           return result;
       }

       private void topView(TreeNode node, int hd, int level) {
           if (node == null) return;

           // Update map if first node at this hd or if current node is at a lower level
           if (!map.containsKey(hd) || map.get(hd).getValue() > level) {
               map.put(hd, new Pair<>(node.val, level));
           }

           topView(node.left, hd - 1, level + 1);
           topView(node.right, hd + 1, level + 1);
       }
   }
   ```

## Complexity Analysis

1. **Level Order (BFS) Approach**

   - Time: O(n log w)
     - n is number of nodes
     - w is width of tree (map operations cost log w)
   - Space: O(w)
     - w nodes in queue at worst case
     - w entries in map
   - Pros:
     - Processes nodes level by level
     - Natural order from left to right
   - Best for most cases

2. **DFS Approach**
   - Time: O(n log w)
     - n nodes processed
     - w width of tree for map operations
   - Space: O(h + w)
     - h height of tree for recursion
     - w entries in map
   - Pros:
     - Less space in narrow trees
     - Simpler implementation

## Edge Cases

1. Empty tree (null root)
2. Single node tree
3. Left-skewed tree
4. Right-skewed tree
5. Perfect binary tree
6. Complete binary tree
7. Tree with nodes only on left edges
8. Tree with nodes only on right edges
9. Tree with gaps in levels
10. Maximum width tree

## Pattern Recognition

This problem relates to:

1. **Tree Views**

   - Bottom View (reverse concept)
   - Left View
   - Right View
   - Vertical Order View

2. **Level Processing**

   - Level Order Traversal
   - Vertical Distance Tracking
   - Width of Binary Tree

3. **Coordinate Systems**
   - Horizontal Distance
   - Level Numbering
   - Node Positioning

## Implementation Tips

1. **BFS Implementation**

   ```java
   // Using TreeMap for sorted horizontal distances
   TreeMap<Integer, Integer> map = new TreeMap<>();

   // Pair class for node and distance
   class Pair {
       TreeNode node;
       int hd;
   }

   // Process level by level
   Queue<Pair> queue = new LinkedList<>();
   queue.offer(new Pair(root, 0));
   ```

2. **Distance Tracking**

   ```java
   // Left child: horizontal distance decreases
   if (node.left != null)
       process(node.left, hd - 1);

   // Right child: horizontal distance increases
   if (node.right != null)
       process(node.right, hd + 1);
   ```

## Common Templates

```java
// Template for view problems with horizontal distance
public List<Integer> treeView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;

    TreeMap<Integer, Integer> map = new TreeMap<>();
    Queue<Pair> queue = new LinkedList<>();
    queue.offer(new Pair(root, 0));

    while (!queue.isEmpty()) {
        Pair cur = queue.poll();

        // Update condition varies by view type
        updateMap(map, cur);

        // Add children with updated distances
        addChildren(queue, cur);
    }

    result.addAll(map.values());
    return result;
}

// Customize for different views
private void updateMap(Map<Integer, Integer> map, Pair cur) {
    // Top view: if (!map.containsKey(hd))
    // Bottom view: always update
    // Vertical view: add to list at hd
}
```

## Related Problems

1. Bottom View of Binary Tree
2. Vertical Order Traversal
3. Right View of Binary Tree
4. Left View of Binary Tree
5. Width of Binary Tree
6. Binary Tree Level Order Traversal
7. Diagonal Traversal
8. Boundary Traversal

## Common Mistakes

1. Not using TreeMap for sorted distances
2. Wrong horizontal distance calculations
3. Not handling null root
4. Incorrect level tracking
5. Wrong order of child processing
6. Not considering overlapping nodes
7. Incorrect distance updates
8. Memory inefficient implementations
9. Not clearing data structures
10. Assuming balanced tree structure
