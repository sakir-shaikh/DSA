# Binary Trees Problems

## Overview

Binary Trees are hierarchical data structures where each node has at most two children. This section covers various tree traversal techniques and problem-solving patterns.

## Common Patterns

1. **Tree Traversals**

   - Inorder (Left-Root-Right)
   - Preorder (Root-Left-Right)
   - Postorder (Left-Right-Root)
   - Level Order (BFS)

2. **View Problems**

   - Top View
   - Bottom View
   - Left View
   - Right View
   - Vertical Order

3. **Tree Properties**
   - Height/Depth
   - Balanced Tree
   - Symmetric Tree
   - Path Problems

## Problem List

| Problem                                               | Pattern         | Difficulty |
| ----------------------------------------------------- | --------------- | ---------- |
| [Depth of Tree](./DepthOfTree/)                       | Tree Properties | Easy       |
| [Right View](./RightViewOfTree/)                      | View Problems   | Medium     |
| [Top View](./TopView/)                                | View Problems   | Medium     |
| [Inorder Traversal](./Traversal/InOrder/)             | Tree Traversal  | Easy       |
| [Level Order Traversal](./Traversal/LevelOrder/)      | Tree Traversal  | Medium     |
| [Postorder Traversal](./Traversal/PostOrder/)         | Tree Traversal  | Easy       |
| [Preorder Traversal](./Traversal/PreOrder/)           | Tree Traversal  | Easy       |
| [Vertical Order Traversal](./VerticalOrderTraversal/) | View Problems   | Hard       |
| [ZigZag Traversal](./ZigZagTraversal/)                | Tree Traversal  | Medium     |

## Learning Path

1. Learn basic traversals (In, Pre, Post)
2. Master level order traversal
3. Understand view problems
4. Practice tree properties
5. Tackle complex transformations

## Key Concepts

1. **Tree Node Structure**

   ```java
   class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
   }
   ```

2. **Common Templates**

   ```java
   // Level Order (BFS)
   Queue<TreeNode> queue = new LinkedList<>();
   queue.offer(root);
   while (!queue.isEmpty()) {
       int levelSize = queue.size();
       for (int i = 0; i < levelSize; i++) {
           TreeNode node = queue.poll();
           // process node
           if (node.left != null) queue.offer(node.left);
           if (node.right != null) queue.offer(node.right);
       }
   }

   // DFS Template
   void dfs(TreeNode node) {
       if (node == null) return;
       // process node (preorder)
       dfs(node.left);
       // process node (inorder)
       dfs(node.right);
       // process node (postorder)
   }
   ```

## Folder Structure

Each problem folder contains:

- `Question.md`: Problem statement, examples, approach
- `Solution.java`: Implementation with detailed comments
- `TestCases.md` (where applicable): Test scenarios
