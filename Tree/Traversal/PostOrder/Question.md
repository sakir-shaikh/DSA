# Postorder Traversal of Binary Tree

## Problem Statement

Given the root of a binary tree, return the postorder traversal of its nodes' values as a list. In postorder traversal, we visit the nodes in the following order: left subtree, right subtree, root node (Left-Right-Root or LRN).

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

Output: [4,5,2,3,1]
Explanation:
1. Visit left subtree of 1:
   - Visit left of 2 -> print 4
   - Visit right of 2 -> print 5
   - Visit 2
2. Visit right subtree of 1 -> print 3
3. Finally visit root -> print 1
```

### Example 2

```
Input:
    1
     \
      2
     /
    3

Output: [3,2,1]
Explanation:
1. Visit right subtree of 1:
   - Visit left of 2 -> print 3
   - Visit 2
2. Visit root -> print 1
```

### Example 3

```
Input: []
Output: []
Explanation: Empty tree has no nodes to traverse
```

## Approach & Intuition

1. **Recursive Approach (DFS - Simple)**

   ```java
   class Solution {
       public List<Integer> postorderTraversal(TreeNode root) {
           List<Integer> result = new ArrayList<>();
           postorder(root, result);
           return result;
       }

       private void postorder(TreeNode node, List<Integer> result) {
           if (node == null) return;

           // First recur on left child
           postorder(node.left, result);

           // Then recur on right child
           postorder(node.right, result);

           // Finally deal with the node
           result.add(node.val);
       }
   }
   ```

2. **Iterative Approach using Two Stacks**

   ```java
   public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       if (root == null) return result;

       Stack<TreeNode> stack1 = new Stack<>();
       Stack<TreeNode> stack2 = new Stack<>();

       stack1.push(root);

       // First store in stack2 in reverse order
       while (!stack1.isEmpty()) {
           TreeNode current = stack1.pop();
           stack2.push(current);

           if (current.left != null) {
               stack1.push(current.left);
           }
           if (current.right != null) {
               stack1.push(current.right);
           }
       }

       // Pop from stack2 to get postorder
       while (!stack2.isEmpty()) {
           result.add(stack2.pop().val);
       }

       return result;
   }
   ```

3. **Iterative with Single Stack**
   ```java
   public List<Integer> postorderTraversal(TreeNode root) {
       LinkedList<Integer> result = new LinkedList<>();
       if (root == null) return result;

       Stack<TreeNode> stack = new Stack<>();
       stack.push(root);

       while (!stack.isEmpty()) {
           TreeNode current = stack.pop();
           // Add to front of list
           result.addFirst(current.val);

           // Push left first (so it's processed after right)
           if (current.left != null) {
               stack.push(current.left);
           }
           if (current.right != null) {
               stack.push(current.right);
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
     - Worst case O(n) for skewed tree
   - Best for simple implementation
   - Intuitive and easy to understand

2. **Two Stacks Approach**

   - Time: O(n)
     - Process each node twice
   - Space: O(n)
     - Two stacks can contain all nodes
   - More intuitive iterative solution
   - Better for understanding the process

3. **Single Stack Approach**
   - Time: O(n)
     - Process each node once
   - Space: O(h)
     - Stack contains at most h nodes
   - Most space-efficient iterative solution
   - Trickier to understand

## Edge Cases

1. Empty tree (null root)
2. Single node tree
3. Left-skewed tree
4. Right-skewed tree
5. Perfect binary tree
6. Complete binary tree
7. Tree with duplicate values
8. Maximum height tree
9. Tree with negative values
10. Binary search tree (special case)

## Pattern Recognition

This problem relates to:

1. **Tree Traversal Patterns**

   - Left subtree first
   - Right subtree second
   - Root last (LRN)

2. **Stack-based Problems**

   - Reverse order processing
   - Parent tracking
   - Path recording

3. **Tree Properties**
   - Expression evaluation
   - Tree comparison
   - Tree reconstruction

## Implementation Tips

1. **Recursive Implementation**

   ```java
   // Follow LRN pattern strictly
   postorder(node.left);   // Left
   postorder(node.right);  // Right
   result.add(node.val);   // Node
   ```

2. **Stack Management**

   ```java
   // For two stacks approach
   Stack<TreeNode> s1 = new Stack<>();  // Processing
   Stack<TreeNode> s2 = new Stack<>();  // Result order

   // For single stack with LinkedList
   LinkedList<Integer> result = new LinkedList<>();
   result.addFirst(val);  // Add at front
   ```

## Common Templates

```java
// Template for postorder traversal variations
public List<Integer> traverse(TreeNode root) {
    LinkedList<Integer> result = new LinkedList<>();
    if (root == null) return result;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
        TreeNode current = stack.pop();

        // Add at beginning (reverses final order)
        result.addFirst(current.val);

        // Add left before right
        if (current.left != null) {
            stack.push(current.left);
        }
        if (current.right != null) {
            stack.push(current.right);
        }
    }

    return result;
}
```

## Related Problems

1. Binary Tree Preorder Traversal
2. Binary Tree Inorder Traversal
3. Binary Tree Level Order Traversal
4. Construct Binary Tree from Inorder and Postorder
5. Expression Tree Evaluation
6. Verify Preorder Serialization
7. Binary Search Tree Iterator
8. Serialize and Deserialize Binary Tree

## Common Mistakes

1. Wrong traversal order (mixing L-R-N)
2. Not handling null nodes
3. Stack overflow in recursive approach
4. Wrong stack order in iterative
5. Not maintaining parent references
6. Complex iterative implementations
7. Not clearing data structures
8. Modifying tree structure
9. Assuming balanced tree
10. Missing edge cases
