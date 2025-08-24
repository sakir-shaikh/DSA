# Inorder Traversal of Binary Tree

## Problem Statement

Given the root of a binary tree, return the inorder traversal of its nodes' values as a list. In inorder traversal, we visit the nodes in the following order: left subtree, root node, right subtree.

**Constraints:**

1. The number of nodes in the tree is in the range [0, 100]
2. -100 ≤ Node.val ≤ 100
3. Return the values in the exact order of traversal

## Examples

### Example 1

```
Input:
    1
   / \
  2   3
 / \
4   5

Output: [4,2,5,1,3]
Explanation:
1. Visit left subtree of 1 -> go to 2
2. Visit left subtree of 2 -> print 4
3. Visit root 2
4. Visit right subtree of 2 -> print 5
5. Visit root 1
6. Visit right subtree of 1 -> print 3
```

### Example 2

```
Input:
    1
     \
      2
     /
    3

Output: [1,3,2]
Explanation:
1. No left child of 1 -> print 1
2. Visit right subtree of 1 -> go to 2
3. Visit left subtree of 2 -> print 3
4. Visit root 2
```

### Example 3

```
Input: []
Output: []
Explanation: Empty tree has no nodes to traverse
```

## Approach & Intuition

1. **Recursive Approach (DFS)**

   ```java
   class Solution {
       public List<Integer> inorderTraversal(TreeNode root) {
           List<Integer> result = new ArrayList<>();
           inorder(root, result);
           return result;
       }

       private void inorder(TreeNode node, List<Integer> result) {
           if (node == null) return;

           // First recur on left child
           inorder(node.left, result);

           // Then add the node's value
           result.add(node.val);

           // Finally recur on right child
           inorder(node.right, result);
       }
   }
   ```

2. **Iterative Approach using Stack**

   ```java
   public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       Stack<TreeNode> stack = new Stack<>();
       TreeNode current = root;

       while (current != null || !stack.isEmpty()) {
           // Reach the leftmost node of current node
           while (current != null) {
               stack.push(current);
               current = current.left;
           }

           // Current is now null, pop an element from stack
           current = stack.pop();

           // Add the node's value
           result.add(current.val);

           // Set current to process right subtree
           current = current.right;
       }

       return result;
   }
   ```

3. **Morris Traversal (O(1) Space)**
   ```java
   public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       TreeNode current = root;

       while (current != null) {
           if (current.left == null) {
               result.add(current.val);
               current = current.right;
           } else {
               // Find the inorder predecessor
               TreeNode predecessor = current.left;
               while (predecessor.right != null &&
                     predecessor.right != current) {
                   predecessor = predecessor.right;
               }

               if (predecessor.right == null) {
                   // Make current as right child of its predecessor
                   predecessor.right = current;
                   current = current.left;
               } else {
                   // Revert the changes
                   predecessor.right = null;
                   result.add(current.val);
                   current = current.right;
               }
           }
       }
       return result;
   }
   ```

## Complexity Analysis

1. **Recursive Approach**

   - Time: O(n)
     - Visit each node exactly once
   - Space: O(h)
     - h is height of tree
     - Recursion stack in worst case
   - Best for simple implementations

2. **Iterative Approach**

   - Time: O(n)
     - Visit each node once
   - Space: O(h)
     - Stack can contain at most h nodes
   - Better for understanding process flow

3. **Morris Traversal**
   - Time: O(n)
     - Although we traverse some nodes twice
   - Space: O(1)
     - No extra space except for output
   - Best when space is a constraint

## Edge Cases

1. Empty tree (null root)
2. Single node tree
3. Left-skewed tree (only left children)
4. Right-skewed tree (only right children)
5. Perfect binary tree
6. Complete binary tree
7. Tree with duplicate values
8. Maximum height tree
9. Tree with negative values
10. Unbalanced tree

## Pattern Recognition

This problem relates to:

1. **Tree Traversal Methods**

   - Preorder (Root, Left, Right)
   - Postorder (Left, Right, Root)
   - Level Order (BFS)

2. **Stack Applications**

   - DFS implementation
   - Expression Tree evaluation
   - Backtracking

3. **Tree Problems**
   - Binary Search Tree Validation
   - Tree Construction
   - Path Finding

## Implementation Tips

1. **Recursive Implementation**

   ```java
   private void inorder(TreeNode node, List<Integer> result) {
       if (node == null) return;  // Base case first

       // Follow L-N-R pattern
       inorder(node.left, result);    // Left
       result.add(node.val);          // Node
       inorder(node.right, result);   // Right
   }
   ```

2. **Stack Management**
   ```java
   // Always check both conditions
   while (current != null || !stack.isEmpty()) {
       // Process all left nodes first
       while (current != null) {
           stack.push(current);
           current = current.left;
       }
   }
   ```

## Common Templates

```java
// Template for tree traversals
public List<Integer> traverse(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;

    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
        // Process current node
        processNode(current, stack, result);

        // Update current for next iteration
        current = getNextNode(stack);
    }
    return result;
}

// Customize these methods for different traversals
private void processNode(TreeNode node, Stack<TreeNode> stack,
                        List<Integer> result) {
    // Implement based on traversal type
}

private TreeNode getNextNode(Stack<TreeNode> stack) {
    // Implement based on traversal type
    return stack.isEmpty() ? null : stack.pop();
}
```

## Related Problems

1. Binary Tree Preorder Traversal
2. Binary Tree Postorder Traversal
3. Binary Tree Level Order Traversal
4. Validate Binary Search Tree
5. Convert Binary Tree to Linked List
6. Binary Tree Maximum Path Sum
7. Construct Binary Tree from Traversal
8. Flatten Binary Tree to Linked List

## Common Mistakes

1. Wrong traversal order (mixing up L-N-R)
2. Not handling null nodes
3. Stack overflow in recursive approach
4. Incorrect stack management in iterative
5. Not considering space complexity
6. Modifying tree structure unintentionally
7. Wrong base cases in recursion
8. Not clearing data structures between calls
9. Assuming balanced tree structure
10. Not handling edge cases properly
